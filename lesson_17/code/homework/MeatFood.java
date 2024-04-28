package homework;

import java.util.Objects;

public class MeatFood extends Food{
  private String meatType; //тип мяса из которого изготовлен продукт.

  public MeatFood(double price, String name, long barCode, String expDate, String meatType) {
    super(price, name, barCode, expDate);
    this.meatType = meatType;
  }

  public String getMeatType() {
    return meatType;
  }

  public void setMeatType(String meatType) {
    this.meatType = meatType;
  }

  @Override
  public String toString() {
    return super.toString() + "MeatFood{" +
        "meatType='" + meatType + '\'' +
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

    MeatFood meatFood = (MeatFood) o;

    return Objects.equals(meatType, meatFood.meatType);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (meatType != null ? meatType.hashCode() : 0);
    return result;
  }
}
