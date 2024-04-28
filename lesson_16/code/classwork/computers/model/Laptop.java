package classwork.computers.model;

public class Laptop extends Computer1 {


  private double displaySize;
  protected double weight;
  private int batteryCapacity;

  public Laptop(String cpu, int ram, int ssd, String brand, double price, double displaySize,
      double weight, int batteryCapacity) {
    super(cpu, ram, ssd, brand, price);
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
    return super.toString() + "\nLaptop{" +
        "displaySize=" + displaySize +
        ", weight=" + weight +
        ", batteryCapacity=" + batteryCapacity +
        '}';
  }
}
