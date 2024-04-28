package classwork;

//Возведите число в квадрат с помощью метода, получающего число в качестве аргумента.
// Возведите элемент массива в квадрат с помощью метода, получающего массив в качестве аргумента.
// Сравните первоначальные значения и полученные результаты.
public class ArrayRefAppl {

  public static void main(String[] args) {
    //work witch primitive
    int x = 10;
    System.out.println("x before x^2 = " + x);

    pow2Var(x);
    System.out.println("x after method pow2Var = " + x);

    //work with array
    int[] arr = {1, 10, 3};
    System.out.println("arr[1] bevor ^2 = " + arr[1]);
    pow2Arr(arr);//call method, arr -as argument
    System.out.println("arr[1] after method pow2Arr(int[] arr) " + arr[1]);

    System.out.println(arr);
  }//end of main

  private static void pow2Arr(int[] arr) {
    arr[1] = arr[1] * arr[1];
    System.out.println("arr[1] in^2 = " + arr[1]);
  }

  public static void pow2Var(int x) {
    x = x * x;
    System.out.println("x^2 = " + x);
  }

}//end of class
