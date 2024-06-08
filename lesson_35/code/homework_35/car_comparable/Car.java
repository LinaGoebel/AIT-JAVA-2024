package homework_35.car_comparable;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements Comparable<Car> {

  @Override
  public int compareTo(Car o) {
    int res = this.brand.compareTo(o.brand);
    if (res != 0) {
      return res;

    } else {
      res = this.year - o.year;
      return res;
    }
  }

  private String brand;
  private String color;
  private int year;
  private int price;

  public Car(String brand, String color, int year, int price) {
    this.brand = brand;
    this.color = color;
    this.year = year;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", color='" + color + '\'' +
        ", year=" + year +
        ", price=" + price +
        '}';
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Car car)) {
      return false;
    }
    return this.brand.equals(((Car) o).brand) && this.price == (((Car) o).price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, price);
  }
}
