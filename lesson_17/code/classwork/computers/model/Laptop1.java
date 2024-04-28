package classwork.computers.model;

public class Laptop1 extends Computer1 {


  private double displaySize;
  protected double weight;
  private int batteryCapacity;

  public Laptop1(String cpu, int ram, int ssd, String brand, double price, double displaySize,
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
    return super.toString() + "Laptop{" +
        "displaySize=" + displaySize +
        ", weight=" + weight +
        ", batteryCapacity=" + batteryCapacity +
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
    if (!super.equals(o)) {
      return false;
    }

    Laptop1 laptop1 = (Laptop1) o;

    if (Double.compare(displaySize, laptop1.displaySize) != 0) {
      return false;
    }
    if (Double.compare(weight, laptop1.weight) != 0) {
      return false;
    }
    return batteryCapacity == laptop1.batteryCapacity;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(displaySize);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(weight);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + batteryCapacity;
    return result;
  }
}
