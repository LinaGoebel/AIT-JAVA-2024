package classwork;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ведите радиус окружности: ");
    double  radius = scanner.nextDouble();
    double circleArea = Constants.PI * 2 * 2;
    System.out.println("Площадь = " + circleArea);

  }

}
