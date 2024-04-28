package homework;

//задайте массив из 10 случайных чисел в интервале от -10 до 10.
// Протестируйте работу методов на созданном массиве.
//Написать метод, принимающий массив целых чисел, и возвращающий произведение всех его элементов с четными индексами.
public class EvenElements {

  public static void main(String[] args) {
    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * (10 - (-10) + 1) + (-10));
      System.out.print(arr[i] + "\t");
    }
    System.out.println();
    int res = evenElements(arr);
    System.out.print("The product all its elements with even indices: " + res);
  }

  public static int evenElements(int[] arr) {
    int index = 1;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        index *= arr[i];
      }
    }
    return index;
  }
}
