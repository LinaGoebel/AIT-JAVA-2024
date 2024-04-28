package classwork.beverage;

public class Beverage {

  private String type;
  private boolean isAlcohol;
  private String titel;
  private int quantity;
  private String packing;

  //all argument constructor
  public Beverage(String type, boolean isAlcohol, String titel, int quantity, String packing) {
    this.type = type;
    this.isAlcohol = isAlcohol;
    this.titel = titel;
    this.quantity = quantity;
    this.packing = packing;

  }

  //no arguments constructor
  public Beverage() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isAlcohol() {
    return isAlcohol;
  }

  public void setAlcohol(boolean alcohol) {
    isAlcohol = alcohol;
  }

  public String getTitel() {
    return titel;
  }

  public void setTitel(String titel) {
    this.titel = titel;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getPacking() {
    return packing;
  }

  public void setPacking(String packing) {
    this.packing = packing;
  }
  //method to buy
  public void toBuy(String titel, String packing, int quantity) {
    System.out.println("Go to market und buy: " + titel + ", " + packing + ", " + quantity + ".");
  }
  //method what we have on stock
  public  void displayStock(){
    System.out.println("We have: " + titel + ", " + packing + ", " + quantity + ".");
  }
}
