package homework;

//Задать в программе три стороны треугольника. Проверить выполнимость неравенства треугольника -
// любая из сторон должна быть меньше суммы двух других. Сообщить результат - существует или
// нет треугольник с заданными сторонами.
public class Triangle {

  public static void main(String[] args) {
    int a = 23;
    int b = 19;
    int c = 45;

    if ((a + b) > c && (b + c) > a && (c + a) > b) {
      System.out.println("Triangle exists");
    } else {
      System.out.println("Triangle doesn't exist");
    }
  }
}
