package classwork;

import java.util.Scanner;

// Написать программу, которая по введенной цифре от 1 до 7 определяет день недели.
// Замените ввод цифры на первую букву дня недели.
public class DayOfWeek {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input first latter of day week: ");
   // int number = scanner.nextInt();
    String firstLetter = scanner.next();

    switch (firstLetter) {
      case "M" -> System.out.println("Monday");
      case "Tu" -> System.out.println("Tuesday");
      case "W" -> System.out.println("Wednesday");
      case "Th" -> System.out.println("Thursday");
      case "F" -> System.out.println("Friday");
      case "Sa" -> System.out.println("Saturday");
      case "Su" -> System.out.println("Sunday");
    }
  }
}
