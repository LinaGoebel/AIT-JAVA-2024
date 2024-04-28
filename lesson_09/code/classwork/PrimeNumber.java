package classwork;

import java.util.Scanner;

//Пользователь вводит натуральное число n. Определите, является ли оно простым.
// Простое число - это такое число, которое делится только на себя и на 1.
// Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ... Обеспечьте защиту от ввода пользователем отрицательных чисел.
public class PrimeNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input integer and positive number: ");
    int number = scanner.nextInt();

    while (number <= 0) {
      System.out.println("Wrong input, try again.");
      number = scanner.nextInt();
    }
    boolean isPrime = true;
    int division = 2;
    while (division < number) {
      if (number % division == 0) {
        isPrime = false;
        break;
      }
      division++;
    }
    System.out.println(number + " is prime: " + isPrime);
  }
}
