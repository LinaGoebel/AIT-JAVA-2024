package homework;

//задайте массив из 10 случайных чисел в интервале от -10 до 10.
//Написать метод, принимающий массив целых чисел, и возвращающий сумму всех его нечетных элементов.
// Протестируйте работу методов на созданном массиве.
public class SumOfOddElements {

  public static void main(String[] args) {
    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * (10 - (-10) + 1) + (-10));
      System.out.print(arr[i] + "\t");
    }
    System.out.println();

    String res = sumOfOddElements(arr);
    System.out.println(res);

  }

  private static String sumOfOddElements(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        sum += arr[i];
      }
    }
    return String.format("The sum of all odd elements: %d", sum);
  }
}


