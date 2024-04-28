package classwork;

import java.util.Scanner;

//Пользователь вводит натуральное число (целое, положительное). Выясните, сколько цифр в числе.
public class DigitsInNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input integer an positive number: ");
    long number = scanner.nextLong();
    int count = 0;

    while (number > 0) {
      number = number / 10;
      count++;
    }
    System.out.println("Number of digits are: " + count);
  }

}
