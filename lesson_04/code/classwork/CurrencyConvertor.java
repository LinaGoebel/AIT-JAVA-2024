package classwork;
//Задача 1. Реализовать метод, который принимает на вход сумму денег в евро, а возвращает ее
// значение в долларах. Значение курса задать внутри программы.
public class CurrencyConvertor {

  public static void main(String[] args) {
    double money = 157.98;
    double rate = 1.07;

    double resInDollars = convertToDollars(money, rate);
    System.out.printf("Result = %.2f", resInDollars);
  }

  private static double convertToDollars(double money, double rate) {
    return money * rate;
  }

}
