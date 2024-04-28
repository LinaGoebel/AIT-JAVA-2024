package homework;

import java.util.Scanner;

//Напишите программу для машины на светофоре. Что делать, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.
public class TrafficLight {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the color of the traffic light red, yellow or green light: ");
    String light = scanner.nextLine();

    switch (light) {
      case "red" -> System.out.println("Red. You must stand!!!");
      case "yellow" -> System.out.println("Yellow. Get ready to stop if the light is green or"
          + " get ready to drive if the light is red.");
      case "green" -> System.out.println("Green. You can go.");
      default -> System.out.println("Wrong input!!!");
    }
  }
}
