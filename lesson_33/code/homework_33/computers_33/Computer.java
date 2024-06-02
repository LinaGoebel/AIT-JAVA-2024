package homework_33.computers_33;

import java.util.Objects;

public class Computer implements Comparable<Computer> {

  @Override
  public int compareTo(Computer o) {
    int res = brand.compareTo(o.getBrand());
    if (res != 0) {
      return res;
    }
    res = model.compareTo(o.getModel());
    if (res != 0) {
      return res;
    }
    return 0;
  }

  private long isbn;
  private String brand;
  private String model;
  private double price;
  private double discount;
  private double operationSystem;

  public Computer(long isbn, String brand, String model, double price, double discount, double operationSystem) {
    this.isbn = isbn;
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.discount = discount;
    this.operationSystem = operationSystem;
  }

  public double getOperationSystem() {
    return operationSystem;
  }

  public void setOperationSystem(double operationSystem) {
    this.operationSystem = operationSystem;
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
    StringBuilder sb = new StringBuilder("Computer ");
    sb.append("isbn=").append(isbn);
    sb.append(", brand: ").append(brand);
    sb.append(", model: ").append(model);
    sb.append(", price: ").append(price);
    sb.append(", discount: ").append(discount);
    sb.append(",operation System: ").append(operationSystem);
    return sb.toString();
  }


}
