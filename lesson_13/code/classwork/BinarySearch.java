package classwork;

import java.util.Scanner;

public class BinarySearch {

  public static void main(String[] args) {
    //create array
    int a = -10;
    int b = 10;
    int[] numbers = new int[10];
    ArrayMethods.fillArray(numbers, a, b);
    ArrayMethods.printArray(numbers);

    //sorting array
    ArrayMethods.bubbleSort(numbers);
    ArrayMethods.printArray(numbers);

    //binary search
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input integer number: ");
    int num = scanner.nextInt();

    int index = ArrayMethods.binarySearch(numbers, num);
    System.out.println("Index = " + index);
  }

}
