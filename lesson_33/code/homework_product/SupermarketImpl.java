package homework_product;


import homework.Food;

public class SupermarketImpl implements Supermarket {

  private Product[] products;
  int size;

  public SupermarketImpl() {
    products = new Product[10];
    size = 0;
  }

  @Override
  public boolean addProduct(Product product) {
    if (size >= this.products.length || product == null) {
      return false;
    }
    Product found = findProduct(product.getBarCode());
    if (found != null) {
      return false;
    }
    this.products[size] = product;
    size++;
    return true;
  }

  @Override
  public Product remove(long barCode) {
    for (int i = 0; i < size; i++) {
      if (products[i].getBarCode() == barCode) {
        Product removed = products[i];
        products[i] = products[--size];
        products[size] = null;
        return removed;
      }
    }
    return null;
  }

  @Override
  public Product findProduct(long barCode) {
    for (int i = 0; i < size; i++) {
      if (products[i].getBarCode() == barCode) {
        return products[i];
      }
    }
    return null;
  }

  @Override
  public int quantity() {
    return size;
  }

  @Override
  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(products[i]);
    }
  }

  @Override
  public void update(Product product) {
    for (int i = 0; i < size; i++) {
      if (products[i].getBarCode() == product.getBarCode()) {
        products[i] = product;
        return;
      }
    }
  }

  @Override
  public void expDate() {
    for (int i = 0; i < products.length; i++) {
      if (products[i] instanceof Product) {
        products[i] = (Product) products[i];
        System.out.println(products[i].getName() + ", " + products[i].getBarCode() + ", " +
            products[i].getExpDate());

      }
    }
  }
}