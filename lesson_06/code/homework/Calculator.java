package homework;

import java.util.Scanner;

//Написать приложение - калькулятор для работы с целыми числами: oper == 1 => +, oper == 2 => -,
// oper == 3 => *, oper == 4 => /, oper == 5 => % , other print "Wrong operation".
public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int a = scanner.nextInt();
    System.out.print("Enter a oper: ");
    char oper = scanner.next().charAt(0);
    System.out.print("Enter the number: ");
    int b = scanner.nextInt();

    int sum = 0;

    switch (oper) {
      case '+' -> sum = a + b;
      case '-' -> sum = a - b;
      case '*' -> sum = a * b;
      case '/' -> {
        if (b != 0) {
          sum = a / b;
        } else {
          System.out.println("You can't divide by 0");
        }
      }
      case '%' -> {
        if (b != 0) {
          sum = a % b;
        } else {
          System.out.println("You can't divide by 0");
        }
      }
      default -> System.out.println("Wrong input!");

    }
    System.out.println("Result = " + sum);
  }

}
