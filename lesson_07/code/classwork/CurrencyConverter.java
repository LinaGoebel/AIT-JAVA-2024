package classwork;

import java.util.Scanner;

// Написать программу для конвертации евро в три валюты - доллар, фунт стерлингов и швейцарский франк.
// Для каждой валюты реализуйте свой метод конвертации. Не допускайте ввода некорректных
// (отрицательных) значений обмениваемой валюты.
public class CurrencyConverter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Which currency do you have? USD, CHF, GBP");
    String currency = scanner.nextLine();
    System.out.println("How much currency do you have? ");
    double sum = scanner.nextDouble();

    double result = 0;
    double rateUsd = 1.08;
    double rateChf = 0.95;
    double rateGbp = 1.17;

    switch (currency){
      case "USD" -> result = exchange(sum, rateUsd);
      case "CHF" -> result = exchange(sum, rateChf);
      case "GBP" -> result = exchange(sum, rateGbp);
      default -> System.out.println("Wrong input!");
    }
    System.out.println("Please, take your many in euro: " + result);
  }

  private static double exchange(double sum, double rate) {
    return sum / rate;
  }
}
