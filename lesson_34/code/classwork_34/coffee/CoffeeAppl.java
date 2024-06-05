package classwork_34.coffee;

import java.util.Scanner;

public class CoffeeAppl {

  public static void main(String[] args) {
    System.out.println("Welcome to our Coffee Shop!");

    Coffee[] menu = Coffee.values();
    for (int i = 0; i < menu.length; i++) {
      System.out.println(i + 1 + " - " + menu[i].getName());
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input your choice: ");
    while (true) {
      int choice = scanner.nextInt();
      switch (choice) {
        case 1, 2, 3, 4 -> {
          System.out.println(
              "Here you are: " + menu[choice - 1].getName() + ", price: " + menu[choice
                  - 1].getPrice());
        }
        default -> System.out.println("Wrong choice!");
      }
      System.out.println("Input your choice: ");
      if (choice == 0) {
        break;
      }
    }
  }
}

