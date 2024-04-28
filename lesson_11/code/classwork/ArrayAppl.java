package classwork;

//В классе ArrayAppl реализуйте методы для работы с массивом:
//печатает переданный в метод массив
//заполняет переданный в метод массив случайными целыми числами в интервале от А до В
//меняет указанные по индексам два элемента массива местами
//находит элемент массива
//находит максимальный элемент массива
public class ArrayAppl {

  public static void main(String[] args) {
    int[] arr = new int[10];
    printArray(arr);
    fillArray(arr, 1, 10);
    printArray(arr);

    swabElements(arr, 0, arr.length - 1);//first and last
    printArray(arr);
    swabElements(arr, 2, 8);
    printArray(arr);

    int res = searchByValue(arr, 5);
    System.out.println("Index = " + res);

    int index = maxOfArray(arr);
    System.out.println("Index of max element = " + index);
  }

  //max element
  public static int maxOfArray(int[] arr) {
    int max = arr[0];
    int indexMax = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        indexMax = i;
      }
    }
    return indexMax;
  }

  //search in array by value
  public static int searchByValue(int[] arr, int value) {
    for (int i = 0; i < arr.length; i++) {
      if (value == arr[i]) {
        return i;
      }
    }
    return -1;//not found
  }

  //swab elements
  public static void swabElements(int[] arr, int m, int n) {
    int tmp = arr[m];
    arr[m] = arr[n];
    arr[n] = tmp;
  }

  //fill array with random numbers
  public static void fillArray(int[] arr, int a, int b) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * (b - a + 1) + a);
    }
  }

  //print array
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "\t");
    }
    System.out.println();
  }

}
