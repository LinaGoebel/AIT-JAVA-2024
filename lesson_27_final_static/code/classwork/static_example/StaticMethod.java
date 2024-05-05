package classwork.static_example;

public class StaticMethod {

  public static void main(String[] args) {
    Car bmw = new Car("bmw", 0);
    bmw.go(31);
    bmw.go(64);
    bmw.go(98);

    Car audi = new Car("audi", 12);
    audi.go(31);
    audi.go(64);
    audi.go(98);

    String carArt = Car.drawCar(bmw);
    System.out.println(carArt);

    String carArt2 = Car.drawCar(audi);
    System.out.println(carArt2);

    String carArtBmw = bmw.drawCar2();
    System.out.println(carArtBmw);

    String carArtAudi = bmw.drawCar2();
    System.out.println(carArtAudi);
  }

}
