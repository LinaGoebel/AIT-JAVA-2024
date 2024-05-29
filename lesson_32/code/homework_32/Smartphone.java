package homework_32;

public class Smartphone extends Computer {

  private String operationSystem;
  private boolean isSimCard;

  public Smartphone(long isbn, String brand, String model, double price, double discount,
      String operationSystem, boolean isSimCard) {
    super(isbn, brand, model, price, discount);
    this.operationSystem = operationSystem;
    this.isSimCard = isSimCard;
  }

  public String getOperationSystem() {
    return operationSystem;
  }

  public void setOperationSystem(String operationSystem) {
    this.operationSystem = operationSystem;
  }

  public boolean isSimCard() {
    return isSimCard;
  }

  public void setSimCard(boolean simCard) {
    isSimCard = simCard;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("\tSmartphone - ");
    sb.append("isbn: ").append(super.getIsbn());
    sb.append(", brand: ").append(super.getBrand());
    sb.append(", model: ").append(super.getModel());
    sb.append(", price: ").append(super.getPrice());
    sb.append(", discount: ").append(super.getDiscount());
    sb.append(", operationSystem").append(operationSystem);
    sb.append(", isSimCard ").append(isSimCard);
    return sb.toString();
  }
}
