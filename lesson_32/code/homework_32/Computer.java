package homework_32;

import java.util.Objects;

public abstract class Computer {

  private long isbn;
  private String brand;
  private String model;
  private double price;
  private double discount;

  public Computer(long isbn, String brand, String model, double price, double discount) {
    this.isbn = isbn;
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.discount = discount;
  }

  public long getIsbn() {
    return isbn;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Computer computer)) {
      return false;
    }
    return isbn == computer.isbn;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isbn);
  }

  public void setIsbn(long isbn) {
    this.isbn = isbn;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Computer");
    sb.append("isbn=").append(isbn);
    sb.append(", brand: ").append(brand);
    sb.append(", model: ").append(model);
    sb.append(", price: ").append(price);
    sb.append(", discount: ").append(discount);
    return sb.toString();
  }
}