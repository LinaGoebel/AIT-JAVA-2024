package homework;

// Написать метод, принимающий массив целых чисел, и разворачивающий его. Последний элемент
// становится нулевым, предпоследний, первым, и т. д. Подсказка: этот метод должен изменить полученный массив.
public class ExpandsArray {

  public static void main(String[] args) {
    int[] arr = {289, 45, -56, 345, 8, -12, 97, 1548};
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "\t");
    }
    System.out.println();
    printExpendsArray(arr);
  }

  private static void printExpendsArray(int[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + "\t");
    }
  }
}
