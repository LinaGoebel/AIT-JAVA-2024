package homework;

import java.util.Scanner;

//Вводится шестизначное число (номер автобусного билета). Определите, является ли этот
// билет "счастливым" (сумма первых трех цифр равна сумме трех последних цифр).
public class BusTicket {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Enter a six-digit number: ");
    int number = scanner.nextInt();

    int firstDigit = number / 1000;
    int secondDigit = number % 1000;
    System.out.println(digitSum(firstDigit));
    System.out.println(digitSum(secondDigit));

    if (digitSum(firstDigit) == digitSum(secondDigit)) {
      System.out.println("Congratulations, you've won."
          + "The sum of the first three digits " + digitSum(firstDigit) + " equals "
          + "the sum of the last three digits " + digitSum(secondDigit));
    } else {
      System.out.println("Unfortunately you lost."
          + "The sum of the first three digits " + digitSum(firstDigit) + " not equals "
          + "the sum of the last three digits " + digitSum(secondDigit));
    }
  }
  public static int digitSum(int digit) {
    int sum = 0;
    while (digit > 0) {
      sum += digit % 10;
      digit = digit / 10;
    }
    return sum;
  }
}
