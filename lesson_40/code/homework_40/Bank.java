package homework_40;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Создайте приложение, в которое оператор банка вносит международные наименования валют (USD, EUR, ...). Приложение не должно допускать существования двух одинаковых валют.
public class Bank {

  public static void main(String[] args) {
    Set<String> currency = new HashSet<>();
    String newCurrency;

    System.out.println("Welcome to Bank");
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Input next currency");
      newCurrency = scanner.nextLine();
      if (currency.add(newCurrency)) {
        System.out.println("Currency added");
      } else {
        System.out.println("Currency already exist");
      }
      System.out.println("Continue? y/n");
      String choice = scanner.nextLine();
      if (choice.equals("n")) {
        System.out.println("Good bye");
        break;
      }
    } while (true);

    System.out.println("Currencies: ");
    System.out.println(currency);
  }

}
