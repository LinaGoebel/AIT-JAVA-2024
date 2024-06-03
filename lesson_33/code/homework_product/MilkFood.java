package homework_product;

public class MilkFood extends Product {

  private String milkType;
  private double fat;

  public MilkFood(double price, String name, long barCode, String expDate, String milkType,
      double fat) {
    super(price, name, barCode, expDate);
    this.milkType = milkType;
    this.fat = fat;
  }

  public String getMilkType() {
    return milkType;
  }

  public void setMilkType(String milkType) {
    this.milkType = milkType;
  }

  public double getFat() {
    return fat;
  }

  public void setFat(double fat) {
    this.fat = fat;
  }

  @Override
  public String toString() {
    return "MilkFood{" +
        "price=" + getPrice() +
        ", name='" + getName() + '\'' +
        ", barCode=" + getBarCode() +
        ", expDate=" + getExpDate() +
        "milkType='" + milkType + '\'' +
        ", fat=" + fat +
        '}';
  }
}
