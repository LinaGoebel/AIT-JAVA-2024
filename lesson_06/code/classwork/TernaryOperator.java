package classwork;

import java.util.Scanner;

// В программе задаются два целых числа. Найдите минимальное из них с помощью тернарного оператора.
// Дополните программу возможностью ввода чисел пользователем.
public class TernaryOperator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input 1st number: ");
    int a = scanner.nextInt();
    System.out.println("Input 2st number: ");
    int b = scanner.nextInt();

    int min = (a < b) ? a : b;

    System.out.println("Minimum: " + min);
  }

}
