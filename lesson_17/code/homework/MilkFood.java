package homework;

import java.util.Objects;

public class MilkFood extends Food{
  private String milkType;//тип молока
  private double fat;//жирность продукта

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
    return super.toString() +  "MilkFood{" +
        "milkType='" + milkType + '\'' +
        ", fat=" + fat +
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

    MilkFood milkFood = (MilkFood) o;

    if (Double.compare(fat, milkFood.fat) != 0) {
      return false;
    }
    return Objects.equals(milkType, milkFood.milkType);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    long temp;
    result = 31 * result + (milkType != null ? milkType.hashCode() : 0);
    temp = Double.doubleToLongBits(fat);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
