package classwork.final_example;

public class Main_2 {

  public static void main(String[] args) {
    // так делать не надо: final переменные обычно должны быть неизменяемыми
    final double[] values = {3.14};
    //нельзя переопределить переменную values
    values[0] = 0; // меняем данные в уже существующем массиве, но не переопределяем переменную
    System.out.println("Площадь окружности с радиусом 2: " + values[0] * 4);
  }

}
