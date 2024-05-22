package homework;

public class Restaurant {

  public static void main(String[] args) {
    Cook cookingProcess = new Cook() {
      @Override
      public void startCooking() {
        System.out.println("the cooking just started");
      }
    };
    Kitchen kitchen = new Kitchen();
    kitchen.makeOrder(cookingProcess);
  }

}
