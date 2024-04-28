package classwork;

public class Circus {

  public static void main(String[] args) {
    lightOn();
    entertainer();
    lightOff();
  }

  private static void lightOff() {
    System.out.println("Light is OFF");
  }

  private static void entertainer() {
    jogger();
    clown();
    singer();
  }

  private static void singer() {
    System.out.println("I'm singing in the rain...");
  }

  private static void clown() {
    System.out.println("I'm clown, i'm jocking!");
  }

  private static void jogger() {
    System.out.println("I'm jogger, i'm jogging!");
  }

  private static void lightOn() {
    System.out.println("Light is ON");
  }

}
