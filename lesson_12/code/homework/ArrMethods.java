package homework;

public class ArrMethods {

  //Написать метод, принимающий на вход массив строк. Метод должен вернуть массив,
  // состоящий из самой короткой и самой длинной строки изначального массива.
  public static String[] arrayOfStrings(String[] arr) {
    String min = arr[0];
    String max = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length() < min.length()) {
        min = arr[i];
      }
      if (arr[i].length() > max.length()) {
        max = arr[i];
      }
    }
    return new String[]{min, max};
  }

  //Написать метод copyOfArray. Метод принимает на вход массив целых чисел и целое число -
  // длину нового массива newLength. Метод должен создать новый массив длиной newLength.
  // В новый массив должны быть скопированы элементы из входящего массива:
  //Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
  public static int[] copyOfArray(int[] arr, int newLength){
    int[] newArray = new int[newLength];
    int minLength = arr.length < newLength ? arr.length : newLength;
    for (int i = 0; i < minLength; i++) {
      newArray[i] = arr[i];
    }
    return newArray;
  }

  // Бросьте кубик с 6-ю гранями 20 раз. Подсчитайте, сколько раз выпала каждая цифра.
  // Посчитайте вероятность выпадения каждой грани.
  public static void fillArray(int[] arr, int a, int b) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * (b - a + 1) + a);
    }
  }
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " | ");
    }
    System.out.println();
  }
}
