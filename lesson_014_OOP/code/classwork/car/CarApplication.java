package classwork.car;

import classwork.car.model.Car;

public class CarApplication {

  public static void main(String[] args) {
    Car car = new Car("white", "BMW", false, 25000, 2005, 258000);
    car.displayCar();
    car.moveCar();
  }

}
