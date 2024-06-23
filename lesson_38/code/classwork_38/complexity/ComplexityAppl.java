package classwork_38.complexity;

import java.util.Arrays;

//заведем простой массив целых чисел будем выполнять с ним различные операции:
//вычисление среднего значения,
//поиск элемента,
//поиск мин и макс,
//сортировка оценим вычислительную сложность используемых алгоритмов
public class ComplexityAppl {

  public static void main(String[] args) {
    int[] array = {12, 17, 43, 115, -28, -4, -35};

    int sum = 0;// O(1)
    for (int i = 0; i < array.length; i++) {// O(n)
      sum += array[i];// O(1)
    }
    double avg = (double) sum / array.length;// O(1)
    System.out.println("The average = " + avg);// O(1)
    //общая сложность: O(1) + O(n) + O(1) + O(1) = O(n)

    System.out.println((Arrays.toString(array)));
    ;//O(n
    int index = Arrays.binarySearch(array, 100);
    System.out.println(index);
    //Array sort Bubble sort
    for (int i = 0; i < array.length - 1; i++) {//O(n)
      for (int j = 0; j < array.length - 1 - i; j++) {//O(n)
        if (array[j] > array[j + 1]) {//O(1)
          int temp = array[j];//O(1)
          array[j] = array[j + 1];//O(1)
          array[j + 1] = temp;//O(1)
        }
      }
    }
// O(n^2)
    System.out.println((Arrays.toString(array)));
    index = Arrays.binarySearch(array, 100);//O(log(n))
    System.out.println(index);
    index = Arrays.binarySearch(array, 115);//O(log(n))
    System.out.println(index);
    Arrays.sort(array);//O(n*log(n))
    System.out.println((Arrays.toString(array)));
  }

}
