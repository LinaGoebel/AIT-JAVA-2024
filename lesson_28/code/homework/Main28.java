package homework;

public class Main28 {

  public static void main(String[] args) {
    CarArrayList carList = new CarArrayList();
    carList.add(new Car("Toyota", 2005));
    carList.add(new Car("Honda", 2010));
    carList.add(new Car("Ford", 2015));

    System.out.println("Cars in the list:");
    for (int i = 0; i < carList.size; i++) {
      Car car = carList.get(i);
      System.out.println(car);
    }
    Car removedCar = carList.remove(1);
    System.out.println("Removed car: " + removedCar);
    System.out.println("Updated cars in the list:");
    for (int i = 0; i < carList.size; i++) {
      Car car = carList.get(i);
      System.out.println(car);
    }
  }

}
