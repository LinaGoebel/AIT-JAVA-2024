package homework;

//Создайте массив из 20 случайных целых чисел в интервале от 10 до 20. Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.
public class RandomIntegers {

  public static void main(String[] args) {
    int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * (20 - 10 + 1) + 10);
      System.out.print(array[i] + " | ");
    }
    System.out.println();

    int temp = array[0];
    array[0] = array[array.length - 1];
    array[array.length - 1] = temp;
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " | ");
    }
  }
}
