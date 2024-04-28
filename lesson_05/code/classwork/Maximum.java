package classwork;

//Написать метод, возвращающий максимальное из двух целых чисел. Реализовать метод,
// который возвращает максимальное из трех целых чисел. Числа задаются в программе.
public class Maximum {

  public static void main(String[] args) {
    int a = 20250;
    int b = 18730;
    int c = 22137;

    int max = maximum(a, b);
    int max3 = maximum3(a, b, c);
    System.out.println(max3);
  }

  public static int maximum3(int a, int b, int c) {
    int max3 = 0;
    if(a > b & a > c){
      max3 = a;
    }
    if(b > a & b > c){
      max3 = b;
    }
    if(c > b & c > a){
      max3 = c;
    }
    return max3;
  }

  public static int maximum(int a, int b) {
    int max;
    if (a >= b) {
      System.out.println(a + " is maximum");
      max = a;
    } else {
      System.out.println(b + " is maximum");
      max = b;
    }
    return max;
  }
}
