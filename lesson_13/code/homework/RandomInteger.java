package homework;

import classwork.ArrayMethods;
import java.util.Random;

//Заполните массив целыми числами от 1 до 100. Добавьте случайное целое число в интервале от 1 до 100
// на случайное место в исходный массив.
// Найдите наиболее коротким способом, какое число было добавлено в массив.
public class RandomInteger {

  public static void main(String[] args) {
    int[] arr = new int[101];
    int a = 1;
    int b = 100;
    ArrayMethods.fillArray(arr, a, b);
    ArrayMethods.printArray(arr);

    Random random = new Random();
    int randomNum = random.nextInt(100) + 1;
    int randomIndex = random.nextInt(arr.length);
    arr[randomIndex] = randomNum;

    ArrayMethods.bubbleSort(arr);
    ArrayMethods.printArray(arr);

    int index = ArrayMethods.binarySearch(arr, randomNum);
    if (index >= 0) {
      System.out.println("Number added: " + randomNum + "\nis in the index: " + index);
    } else {
      System.out.println("The added number was not found.");
    }
  }
}
