package classwork.computers.model;

public class SmartPhone extends Laptop1 {
  private String operationSystem;
  private boolean isSimCard;

  public SmartPhone(String cpu, int ram, int ssd, String brand, double price, double displaySize,
      double weight, int batteryCapacity, String operationSystem, boolean isSimCard) {
    super(cpu, ram, ssd, brand, price, displaySize, weight, batteryCapacity);
    this.operationSystem = operationSystem;
    this.isSimCard = isSimCard;
  }

  @Override
  public String toString() {
    return super.toString() + "\nSmartPhone{" +
        "operationSystem='" + operationSystem + '\'' +
        ", isSimCard=" + isSimCard +
        '}';
  }
}
