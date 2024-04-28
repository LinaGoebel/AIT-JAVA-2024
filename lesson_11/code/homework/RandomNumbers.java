package homework;

import java.util.Scanner;

//Задайте массив из 10 случайных целых чисел в интервале от -20 до 20.
// Запросите у пользователя какое-то целое число. Определите, есть ли это число в массиве.
// Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
// а возвращает ответ - нашлось ли это число в массиве.
public class RandomNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input an integer between -20 and 20: ");
    int num = scanner.nextInt();

    while (num > 20 || num < -20) {
      System.out.println("Write the correct number");
      num = scanner.nextInt();
    }

    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * (20 - (-20) + 1) + (-20));
      System.out.print(arr[i] + "\t");
    }
    System.out.println();

    String res = searchInArray(arr, num);
    System.out.println(res);

  }

  public static String searchInArray(int[] arr, int number) {
    for (int i = 0; i < arr.length; i++) {
      if (number == arr[i]) {
        return String.format("Array number '%d' found", number);
      }
    }
    return String.format("Array number '%d' not found", number);
  }
}


