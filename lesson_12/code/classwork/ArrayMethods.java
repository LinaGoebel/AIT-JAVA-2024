package classwork;

import java.util.Arrays;

//Создайте класс ArrayMethods и реализуйте в нем методы:
//
//печать массива целых чисел/
//печать массива строк/
//поиск максимального элемента/
//поиск индекса максимального элемента /
//Разработайте в классе ArrayMethods метод, который реализует алгоритм Bubble Sort (пузырьковая сортировка).
public class ArrayMethods {

  //fill array witch random numbers
  public static void fillArray(int[] arr, int a, int b) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * (b - a + 1) + a);
    }
  }

  //binary search
  //метод будет возврощать индекс найденного элемента или некоторое отрицательное число, если его не нашлось
  //передаём в метод массив и число
  //метод должен ответить на вопрос о наличии в массиве
  public static int binarySearch(int[] arr, int element) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == element) {
        return mid;//index of element
      } else if (element < arr[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -left - 1;//when element not found
  }

  //bubble sort
  //comparing(Сравнение) two elements of array: arr[i] ? arr[i + 1]
  //if left arr[i] > right arr[i + 1], swap(обменять)
  public static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {// выполняют сортировку массива
      for (int j = 0; j < arr.length - 1 - i; j++) {//правый конец будет двигаться к началу массива
        if (arr[j] > arr[j + 1]) {                  //управляет сравнением и обменом элементов.
          //swab elements
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }


  //print array int[]
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " | ");//print current element of array
    }
    System.out.println();
  }

  //print array String[]
  public static void printArray(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " | ");//print current element of array
    }
    System.out.println();
  }

  //max element of int[]
  public static int maxOfArray(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  //index of max element
  public static int indexMaxOfArray(int[] arr) {
    int max = arr[0];
    int indexOfMax = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        indexOfMax = i;
      }
    }
    return indexOfMax;
  }
}


