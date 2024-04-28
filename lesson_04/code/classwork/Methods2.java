package classwork;
//Создайте метод, который принимает целое число и возвращает целую часть от деления его на 5.
// Пример: число 83, метод возвращает 16.
//Создайте метод, который находит сумму цифр двузначного целого числа. Пример: число 23, сумма цифр 5.
//Деление чисел типа double, вычисление среднего арифметического. Давайте вычислим средний возраст нашей группы.

public class Methods2 {

  public static void main(String[] args) {
    int p = 2000;
    int newPrice = restDivBy5(p);
    System.out.println("New price / 5 = " + newPrice);

    int d = 23;
    System.out.println("Sum of digits " + d + " = " + sumOfDigits(d));

    int sumOfAges = 39 + 18 + 44 + 28;
    double numberOfStudent = 4;
    double a = averageAge(sumOfAges, numberOfStudent);
    System.out.println("Average age of students = " + a);

  }
  public static int restDivBy5(int price){
    return price / 5;
  }
  public static int sumOfDigits(int d){
    int digit1FromRight = d % 10;
    int digit2 = d / 10;
    return digit1FromRight + digit2;
  }
  public static double averageAge(int a, double b){
    return a / b;
  }

}
