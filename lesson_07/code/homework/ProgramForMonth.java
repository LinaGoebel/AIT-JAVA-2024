package homework;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя номер месяца и выводит номер квартала,
// к которому этот месяц относится.
public class ProgramForMonth {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the month number: ");
    int month = scanner.nextInt();

    switch (month) {
      case 12, 1, 2 -> System.out.println("This month belongs to the first quarter. Winter");
      case 3, 4, 5 -> System.out.println("This month belongs to the second quarter. Spring");
      case 6, 7, 8 -> System.out.println("This month belongs to the third quarter. Summer");
      case 9, 10, 11 -> System.out.println("This month belongs to the fourth quarter. Autumn");
      default -> System.out.println("Wrong input!");
    }
  }
}
