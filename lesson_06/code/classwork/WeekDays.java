package classwork;

import java.util.Scanner;

//Написать программу, которая по введенной цифре от 1 до 7 определяет день недели.
// Второй вариант - на цифры от 1 до 5 программа сообщает, что это будний день, а на 6 и 7, что это выходной.
public class WeekDays {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input the number day of the week: ");
    int day = scanner.nextInt();

    switch (day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      case 3 -> System.out.println("Wednesday");
      case 4 -> System.out.println("Thursday");
      case 5 -> System.out.println("Friday");
      case 6 -> {
        System.out.println("Saturday");
        System.out.println("This is first day of weekend");
      }
      case 7 -> {
        System.out.println("Sunday");
        System.out.println("This is second day of weekend");
      }
      default -> System.out.println("Wrong input!");
    }
    switch (day) {
      case 1, 2, 3, 4, 5 -> System.out.println("This is working day.");
      case 6, 7 -> System.out.println("This is weekend!");
    }
  }

}
