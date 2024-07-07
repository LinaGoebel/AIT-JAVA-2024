package classwork_42.car_garage.model;

import java.util.Objects;

public class Car {

  private String regNumber;
  private String model;
  private String company;
  private double engine;
  private String color;

  public Car(String regNumber, String model, String company, double engine, String color) {
    this.regNumber = regNumber;
    this.model = model;
    this.company = company;
    this.engine = engine;
    this.color = color;
  }

  public String getRegNumber() {
    return regNumber;
  }

  public void setRegNumber(String regNumber) {
    this.regNumber = regNumber;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getModel() {
    return model;
  }

  public String getCompany() {
    return company;
  }

  public double getEngine() {
    return engine;
  }

  @Override
  public String toString() {
    return "Car [regNumber=" + regNumber + ", model=" + model + ", company=" + company + ", engine="
        + engine
        + ", color=" + color + "]";

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Car car)) {
      return false;
    }
    return Double.compare(engine, car.engine) == 0 && Objects.equals(regNumber,
        car.regNumber) && Objects.equals(model, car.model) && Objects.equals(
        company, car.company) && Objects.equals(color, car.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regNumber, model, company, engine, color);
  }
}

