package homework;

import java.time.LocalDate;

public class MarketAppl {

  public static void main(String[] args) {
    Product[] products = new Product[5];
    products[0] = new MeatFood(4.95, "Salami", 458712645, "2024-30-12", "Beef");
    products[1] = new MilkFood(1.26, "Milk", 564789125, "2024-06-15", "low-fat", 1.5);
    products[2] = new Food(1.74, "Bread", 587416941, "2024-03-07");
    products[3] = new Product(1.98, "Shower Gel", 997416941);
    products[4] = new Product(2.35, "Shampoo", 545616941);

    printArr(products);
    System.out.println("----------------------------------------------");
    double sumOfPrice = getSumOfPrice(products);
    System.out.println("The sum of the prices of all products = " + sumOfPrice);
    System.out.println("----------------------------------------------");
    nonFood(products);
    System.out.println("----------------------------------------------");
    Product foundProduct = productBarcode(products, 458712645);
    System.out.println("Produkt: " + foundProduct);
    System.out.println("----------------------------------------------");
    printArr(bubbleSortPrice(products));
    System.out.println("_______________________________________________");
    //реализуйте метод, который печатает только продукты (Food), имеющие срок годности.
    // Метод должен выводить на печать имя продукта, баркод и дату.
    printProductsWithExpDate(products);

  }

  private static void printProductsWithExpDate(Product[] products) {
    Food food = null;
    for (int i = 0; i < products.length; i++) {

      if(products[i] instanceof Food){
        food = (Food)products[i];
        System.out.println(food.getName() + ", " + food.getBarCode() + ", " + food.getExpDate());
      }
    }
  }


  private static double getSumOfPrice(Product[] products) {
    double sumOfPrice = 0;
    for (int i = 0; i < products.length; i++) {
      sumOfPrice += products[i].getPrice();
    }
    return sumOfPrice;
  }

  private static void printArr(Product[] products) {
    for (int i = 0; i < products.length; i++) {
      System.out.println(products[i]);
    }
  }

  private static void nonFood(Product[] products) {
    for (int i = 0; i < products.length; i++) {
      if (!(products[i] instanceof Food)) {
        System.out.println("Non-food products: " + products[i]);
      }
    }
  }

  public static Product productBarcode(Product[] products, long barCode) {
    for (int i = 0; i < products.length; i++) {
      if (products[i].getBarCode() == barCode) {
        return products[i];
      }
    }
    return null;
  }
  public static Product[] bubbleSortPrice(Product[] products) {
    for (int i = 0; i < products.length - 1; i++) {
      for (int j = 0; j < products.length - 1 - i; j++) {
        if (products[j].getPrice() > products[j + 1].getPrice()) {
          Product temp = products[j];
          products[j] = products[j + 1];
          products[j + 1] = temp;
        }
      }
    }
    return products;
  }
}



