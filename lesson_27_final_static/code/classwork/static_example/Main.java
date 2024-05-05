package classwork.static_example;

public class Main {

  public static void main(String[] args) {
    Car bmw = new Car("bmw", 0);
    System.out.println(bmw);
    bmw.go(20);
    bmw.go(43);
    bmw.go(52);
    System.out.println(bmw);
  }

}
