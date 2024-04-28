package homework;

import java.util.Objects;

public class Product {
  private double price;
  private String name;
  private long barCode;

  public Product(double price, String name, long barCode) {
    this.price = price;
    this.name = name;
    this.barCode = barCode;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getBarCode() {
    return barCode;
  }

  public void setBarCode(long barCode) {
    this.barCode = barCode;
  }

  @Override
  public String toString() {
    return "Product{" +
        "price=" + price +
        ", name='" + name + '\'' +
        ", barCode=" + barCode +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Product product = (Product) o;// делаем casting до нужного нам класса

    if (Double.compare(price, product.price) != 0) {
      return false;
    }
    if (barCode != product.barCode) {
      return false;
    }
    return Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(price);
    result = (int) (temp ^ (temp >>> 32));
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (int) (barCode ^ (barCode >>> 32));
    return result;
  }
}
