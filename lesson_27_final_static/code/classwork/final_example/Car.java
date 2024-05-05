package classwork.final_example;

public class Car {
  public String vendor;
  public int buildYear;

  public Car(String vendor, int buildYear){
    this.vendor = vendor;
    this.buildYear = buildYear;
  }

  @Override
  public String toString() {
    return "Car{" +
        "vendor='" + vendor + '\'' +
        ", buildYear=" + buildYear +
        '}';
  }
}
