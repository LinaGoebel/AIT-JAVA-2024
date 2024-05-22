package homework;

public class RestaurantLambda {

  public static void main(String[] args) {
    Cook cookingProcess = () -> System.out.println("the cooking just started");

    Kitchen kitchen = new Kitchen();
    kitchen.makeOrder(cookingProcess);
  }
}
