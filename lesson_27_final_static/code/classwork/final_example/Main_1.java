package classwork.final_example;

public class Main_1 {

  public static void main(String[] args) {
    //при попытки переопределния переменной будет ошибка
    final double PI = 3.14;

    System.out.println("Площадь окружности с радиусом 2: " + PI * 4);
  }

}
