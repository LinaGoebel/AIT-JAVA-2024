package classwork.static_example;

public class Main1 {

  public static void main(String[] args) {
    Car bmw = new Car("bmw", 0);
    Car audi = new Car("audi", 35);
    System.out.println(bmw);
    System.out.println(audi);
    bmw.go(20);
    bmw.go(43);
    bmw.go(52);

    audi.go(3);
    audi.go(12);
    System.out.println(bmw);
    System.out.println(audi);

    System.out.println("Total mileage = " + Car.totalMileage + " km");//глобальное поле
  }
}
