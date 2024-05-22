package homework;

public class Kitchen {
  void makeOrder(Cook cookingProcess){
    System.out.println("The kitchen got an order");
    cookingProcess.startCooking();
    System.out.println("The kitchen prepared the order");
  }

}
