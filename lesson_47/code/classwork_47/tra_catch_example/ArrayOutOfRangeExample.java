package classwork_47.tra_catch_example;

import java.util.Scanner;

public class ArrayOutOfRangeExample {

  public static void main(String[] args) {
    //// массив целых чисел на 5 элементов, пробуем обратиться к 6-му и более элементу
    int[] array = {-14, 28, -141, 122, 1054};
    System.out.println(array[2]);//-141


    try {
      System.out.println(array[6]);
    } catch (ArrayIndexOutOfBoundsException error) {
      System.out.println("Can't access to such index: " + error.getMessage());
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Continue?");
    String str = scanner.nextLine();
  }
}
