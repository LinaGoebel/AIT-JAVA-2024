package homework;

import java.util.Scanner;

//Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
// если базовая зарплата 500$. За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.
public class PaymentOfMoney {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many years have you worked? ");
    int years = scanner.nextInt();

    int baseSalary = 500;

      switch (years) {
        case 1, 2 -> System.out.println("Your salary: " + baseSalary + " euro.");
        case 3, 4 ->
            System.out.println("You've worked for more than 3 years and your allowance is 10%. "
                + "Your salary: " + (baseSalary + (baseSalary * 0.1)) + " euro.");
        case 5, 6, 7, 8, 9 ->
            System.out.println("You've worked for more than 5 years and your allowance is 50%. "
                + "Your salary: " + (baseSalary + (baseSalary * 0.5)) + " euro.");
        case 10, 11, 12, 13, 14 -> System.out.println("You've worked for more than 10 years and your "
            + "allowance is 100%. Your salary: " + (baseSalary + baseSalary) + " euro.");

        default -> {
          if(years >= 15 && years <= 67){
            System.out.println("You've worked for more than 15 years and your allowance is 150%. "
                + "Your salary: " + (baseSalary + (baseSalary * 1.5)) + " euro.");
          }else {
            System.out.println("Wrong input!");
          }
        }
      }
    }
  }

