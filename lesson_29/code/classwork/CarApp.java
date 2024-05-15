package classwork;

public class CarApp {

  public static void main(String[] args) {
    Transport bmw = new Transport("bmw", "personal", 4.0);

    System.out.println(bmw);

    bmw.go();
    bmw.animalOnWay();
  }

}
