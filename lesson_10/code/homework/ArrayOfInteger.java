package homework;

//Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Найдите максимальный элемент массива и его индекс.
public class ArrayOfInteger {

  public static void main(String[] args) {
    int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

    int max = array[0];
    int index = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
        index = i;
      }
    }
    System.out.printf("The maximum array element %d and its index %d. ", max, index);
  }
}
