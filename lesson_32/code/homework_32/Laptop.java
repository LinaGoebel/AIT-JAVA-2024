package homework_32;

public class Laptop extends Computer {

  private double displaySize;
  private double weight;
  private int batteryCapacity;

  public Laptop(long isbn, String brand, String model, double price, double discount,
      double displaySize, double weight, int batteryCapacity) {
    super(isbn, brand, model, price, discount);
    this.displaySize = displaySize;
    this.weight = weight;
    this.batteryCapacity = batteryCapacity;
  }

  public double getDisplaySize() {
    return displaySize;
  }

  public void setDisplaySize(double displaySize) {
    this.displaySize = displaySize;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public int getBatteryCapacity() {
    return batteryCapacity;
  }

  public void setBatteryCapacity(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("\tLaptop - ");
    sb.append("isbn=").append(super.getIsbn());
    sb.append(", brand: ").append(super.getBrand());
    sb.append(", model: ").append(super.getModel());
    sb.append(", price: ").append(super.getPrice());
    sb.append(", discount: ").append(super.getDiscount());
    sb.append(", displaySize: ").append(displaySize);
    sb.append(", weight: ").append(weight);
    sb.append(", batteryCapacity: ").append(batteryCapacity);
    return sb.toString();
  }
}
