package homework;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя два числа и выводит наибольшее из них.
public class ProgramForLargestNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int max = (a > b) ? a : b;
    System.out.println("Max number: " + max);

      //  if (a > b) {
      //    System.out.println("Number " + a + " more than number " + b);
      //  } else if (b > a) {
      //    System.out.println("Number " + b + " more than number " + a);
      //  } else if (a == b && b == a) {
      //    System.out.println("Numbers are equal");
    }
  }



