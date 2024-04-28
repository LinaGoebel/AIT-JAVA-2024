package homework;

//Написать метод, принимающий массив целых чисел, и возвращающий среднее арифметическое всех его элементов.
public class ArrayOfIntegers {

  public static void main(String[] args) {
    int[] arr = {5, 106, 58, 97, -3, 7, -98};
    double sum = 0;

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "\t");
      sum += arr[i];
    }
    System.out.println();

    double average = sum / arr.length;
    System.out.printf("The arithmetic mean all its elements: %.2f", average);
  }
}
