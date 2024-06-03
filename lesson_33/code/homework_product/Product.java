package homework_product;

import java.util.Objects;

public class Product implements Comparable<Product> {

  @Override
  public int compareTo(Product o) {
    int res = (int) (this.barCode - o.barCode);
    return res;
  }

  private double price;
  private String name;
  private long barCode;
  private String expDate;

  public Product(double price, String name, long barCode, String expDate) {
    this.price = price;
    this.name = name;
    this.barCode = barCode;
    this.expDate = expDate;
  }

  public String getExpDate() {
    return expDate;
  }

  public void setExpDate(String expDate) {
    this.expDate = expDate;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Product product)) {
      return false;
    }
    return barCode == product.barCode;
  }

  @Override
  public int hashCode() {
    return Objects.hash(barCode);
  }

  @Override
  public String toString() {
    return "Product{\t" +
        "price=" + price +
        ", name='" + name + '\'' +
        ", barCode=" + barCode +
        ", expDate=" + expDate +
        '}';
  }


}
