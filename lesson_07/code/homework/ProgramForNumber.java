package homework;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя число и проверяет,
// принадлежит ли оно заданному интервалу [a, b].
public class ProgramForNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the beginning of the interval: ");
    int a = scanner.nextInt();
    System.out.println("Enter the end of the interval: ");
    int b = scanner.nextInt();
    if (a > b) {
      System.out.println("You entered the wrong number. The first number must be less "
          + "than the second number");
      return;
    }

    System.out.println("Enter the number: ");

    int number = scanner.nextInt();
    if (number >= a && number <= b) {
      System.out.println("Number belongs to the given interval");
    } else {
      System.out.println("Number does not belong to the given interval");
    }

  }
}
