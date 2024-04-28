package classwork;
// Объявите две переменные целого типа a и b и присвойте им произвольные значения натуральных чисел.
// Создайте третью переменную res и выведите ее значение на экран таким образом: Если a = b, то res
// будет равно (a+b) * 5 a если нет, то (a - b) * 5.
public class Variables {

  public static void main(String[] args) {
    int a = 25457;
    int b = 37263;

    int res = 0;

    if(a == b){
      System.out.println((a +b) * 5);
    }else {
      System.out.println((a - b) * 5);
    }
  }
}
