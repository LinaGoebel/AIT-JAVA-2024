package homework;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя длины трех сторон треугольника и
// определяет его тип (равносторонний, равнобедренный, разносторонний).
public class ProgramForTriangle {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the lengths of the three sides of the triangle: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if ((a + b) > c && (b + c) > a && (c + a) > b) {
      System.out.println("Triangle exists");

      if (a == b && b == c) {
        System.out.println("Equilateral triangle");
      } else if (a == b || a == c || b == c) {
        System.out.println("Isosceles triangle ");
      } else if (a != b && b != c && c != a) {
        System.out.println("Dissimilar triangle ");
      }
    } else {
      System.out.println("Triangle doesn't exist");
    }
  }
}


