package classwork;
//Создайте метод, который возвращает целое число, противоположное по знаку.
// Пример: число -46, метод возвращает 46.
//Создайте метод, который возвращает куб числа. Пример: число 20, метод возвращает 8 000.
//Создайте метод, который принимает целое число и возвращает остаток от деления его на 2. Пример:
// число 41, метод возвращает 1.
public class Methods1 {

  public static void main(String[] args) {
    int x = 56;
    x = abs(x);
    System.out.println("x = " + x);

    double a = 20.0d;
    System.out.println("Cub = " + cubOfNumber(a));

    int z = 57;
    System.out.println(z + " rest of division by 2 = " + restDivisionBy2(z));
  }
  public static int abs(int number){
   // return Math.abs(number);
    return - number;
  }
  public static double cubOfNumber(double z){
    return z * z * z;
  }
  public static int restDivisionBy2(int z){
    return z % 2;
  }
}
