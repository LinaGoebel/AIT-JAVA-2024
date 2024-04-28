package classwork.beverage;

public class Beer extends Beverage {

  private boolean isDraft;
  private String sort;

  public Beer(String type, boolean isAlcohol, String titel, int quantity, String packing,
      boolean isDraft, String sort) {
    super(type, isAlcohol, titel, quantity, packing);
    this.isDraft = isDraft;
    this.sort = sort;
  }

  public Beer(boolean isDraft, String sort) {
    this.isDraft = isDraft;
    this.sort = sort;
  }

  public void toBuy(String titel, String packing, int quantity) {
    super.toBuy(titel, packing, quantity);
    this.sort = sort;
  }

  public void displayStock() {
    super.displayStock();
    System.out.println("This is " + sort + " beer.");
  }

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }
}
