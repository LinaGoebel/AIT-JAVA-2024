package homework;

import java.util.Scanner;

//Определение времени суток. Напишите программу, которая принимает на ход текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
public class TimeOfDay {

  public static void main(String[] args) {
    int hours;

    Scanner scanner = new Scanner(System.in);
    boolean flag = true;

    while (flag) {
      System.out.println("Enter the time from 0 to 23 hours: ");
      hours = scanner.nextInt();
      if (hours >= 5 && hours <= 11) {
        System.out.println("Good morning.");
      } else if (hours >= 12 && hours <= 16) {
        System.out.println("Good afternoon.");
      } else if (hours >= 17 && hours <= 23) {
        System.out.println("Good evening");
      } else if (hours >= 0 && hours <= 4) {
        System.out.println("Good night.");
      } else {
        flag = false;
        System.out.println("Wrong input");
      }
    }
  }
}
