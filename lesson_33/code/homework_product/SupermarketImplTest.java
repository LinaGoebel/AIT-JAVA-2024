package homework_product;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {

  Supermarket supermarket;
  Product[] products;

  @BeforeEach
  void setUp() {
    supermarket = new SupermarketImpl();
    products = new Product[5];
    products[0] = new MeatFood(4.95, "Salami", 458712645, "2025-01-30", "Beef");
    products[1] = new MilkFood(1.26, "Milk", 564789125, "2024-08-15", "high-fat", 3.5);
    products[2] = new Product(1.74, "Bread", 587416941, "2024-06-07");
    products[3] = new Product(1.98, "Shower Gel", 997416941, "2035-03-07");
    products[4] = new Product(2.35, "Shampoo", 545616941, "2030-03-07");
    for (int i = 0; i < products.length; i++) {
      supermarket.addProduct(products[i]);
    }
  }

  @Test
  void testProductSortByName() {
    Comparator<Product> productComparator = Comparator.comparing(Product::getName);
    System.out.println("==========Test product sorting by name==========");
    printArray(products);
    System.out.println("=====================");
    Arrays.sort(products, productComparator);
    printArray(products);
  }

  @Test
  void testProductSortByPrice() {
    Comparator<Product> productComparator = Comparator.comparingDouble(Product::getPrice);
    System.out.println("==========Test product sorting by price==========");
    printArray(products);
    System.out.println("=====================");
    Arrays.sort(products, productComparator);
    printArray(products);
  }

  @Test
  void addProduct() {
    supermarket.print();
    System.out.println("==========Test adding product==========");
    assertFalse(supermarket.addProduct(products[0]));
    Product newProduct = new Product(2.88, "Coke", 459992645, "2024-02-02");
    assertTrue(supermarket.addProduct(newProduct));
    assertEquals(6, supermarket.quantity());
    supermarket.print();
  }

  @Test
  void remove() {
    supermarket.print();
    System.out.println("==========Test removing product==========");
    supermarket.remove(products[0].getBarCode());
    assertEquals(4, supermarket.quantity());
    supermarket.print();
  }

  @Test
  void findProduct() {
    System.out.println("==========Test finding product==========");
    Product foundProduct = supermarket.findProduct(products[0].getBarCode());
    assertNotNull(foundProduct);
    System.out.println(foundProduct);
  }

  @Test
  void quantity() {
    System.out.println("==========Test quantity==========");
    int quantity = supermarket.quantity();
    assertEquals(5, quantity);
    System.out.println("Quantity: " + quantity);
  }

  @Test
  void print() {
    System.out.println("==========Test print==========");
    supermarket.print();
  }

  @Test
  void update() {
    System.out.println("==========Test update==========");
    Product updatedProduct = new Product(5.50, "Updated Salami", 458712645, "2024-12-30");
    supermarket.update(updatedProduct);
    Product foundProduct = supermarket.findProduct(updatedProduct.getBarCode());
    assertEquals(updatedProduct.getName(), foundProduct.getName());
    supermarket.print();
  }

  @Test
  void expDate() {
    System.out.println("==========Test expDate==========");
    supermarket.expDate();
  }

  public static void printArray(Object[] array) {
    for (Object o : array) {
      System.out.println(o);
    }
  }
}