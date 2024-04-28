package homework;

import java.util.Scanner;

// Вводится положительное целое число, найдите сумму его цифр.
public class PositiveInteger {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a positive integer: ");
    int number = scanner.nextInt();
    int sum = 0;
    int digit = 0;

    if (number <= 0) {
      System.out.println("You've entered the wrong number!!!");
      return;
    }

    while (number > 0) {
      digit = number % 10;
      number = number / 10;
      sum += digit;
    }
    System.out.println("The sum of its digits = " + sum);
  }
}
