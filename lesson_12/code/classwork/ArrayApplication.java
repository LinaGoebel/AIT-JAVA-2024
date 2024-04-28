package classwork;

import java.util.Arrays;

//Создайте класс ArrayAppl, создайте в нем метод main, создайте тестовые массивы и
// вызовите методы из класса ArrayMethods для проверки их работоспособности.
public class ArrayApplication {

  public static void main(String[] args) {

    int[] numbers = {-238, -96, 5, 57, -34, 77, -76, 33, -142, -208};
    ArrayMethods.printArray(numbers);
    int max = ArrayMethods.maxOfArray(numbers);
    System.out.println("Max of array: " + max);
    int maxIndex = ArrayMethods.indexMaxOfArray(numbers);
    System.out.println("Max index of array: " + maxIndex);

    String[] dayOfWeek = {"Mo", "Tu", "We", "Th", "Fr", "Sb", "Sa"};
    ArrayMethods.printArray(dayOfWeek);

    ArrayMethods.bubbleSort(numbers);
    ArrayMethods.printArray(numbers);

  }
}
