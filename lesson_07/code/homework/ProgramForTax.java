package homework;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя его доход и вычисляет сумму налога согласно
// прогрессивной шкале налогообложения
// (например, 10% на доход до 10 000, 20% на доход от 10 001 до 20 000 и т.д.).
public class ProgramForTax {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount of your income: ");
    double amount = scanner.nextDouble();

    if (amount <= 10000) {
      System.out.println("You're taxed 10%.Amount of tax: " + amount * 0.1);
    } else if (amount >= 10001 && amount <= 20000) {
      System.out.println("You're taxed 20%.Amount of tax: " + amount * 0.2);
    } else if (amount >= 20001 && amount <= 30000) {
      System.out.println("You're taxed 30%.Amount of tax: " + amount * 0.3);
    } else if (amount >= 30001 && amount <= 40000) {
      System.out.println("You're taxed 40%.Amount of tax: " + amount * 0.4);
    } else if (amount >= 40001 && amount <= 50000) {
      System.out.println("You're taxed 50%.Amount of tax: " + amount * 0.5);
    } else {
      System.out.println("Go to another department. We don't handle incomes over 50,000.");
    }
  }
}
