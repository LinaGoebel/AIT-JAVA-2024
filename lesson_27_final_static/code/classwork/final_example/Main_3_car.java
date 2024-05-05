package classwork.final_example;

public class Main_3_car {

  public static void main(String[] args) {
    // так делать не надо: final переменные обычно должны быть неизменяемыми
    final Car car = new Car("bmw", 2008);
   // car = new Car("audi", 2004);// ошибка
    car.buildYear = 2050;
    System.out.println(car);
  }
}
