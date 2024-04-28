package classwork;

//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
// Найдите минимальный элемент массива и его индекс.
public class MinArray {

  public static void main(String[] args) {
    int[] array = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};

    int minArray = array[0];
    int index = 0;

    for (int i = 0; i < array.length; i++) {
      if(array[i] < minArray){
        minArray = array[i];
        index = i;
      }
    }
    System.out.println("The minimum array: " + minArray);
    System.out.println("Its index: " + index);
  }
}
