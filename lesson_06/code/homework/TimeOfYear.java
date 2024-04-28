package homework;

import java.util.Scanner;

//Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает,
// какому времени года принадлежит введенный месяц, и какое время года
public class TimeOfYear {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number between 1 and 12 : ");
     int months = scanner.nextInt();

     switch (months){
       case 1 -> System.out.println("January");
       case 2 -> System.out.println("February");
       case 3 -> System.out.println("March");
       case 4 -> System.out.println("April");
       case 5 -> System.out.println("May");
       case 6 -> System.out.println("June");
       case 7 -> System.out.println("July");
       case 8 -> System.out.println("August");
       case 9 -> System.out.println("September");
       case 10 -> System.out.println("October");
       case 11-> System.out.println("November");
       case 12-> System.out.println("December");

       default -> System.out.println("Wrong input!!!");
     }
     switch (months){
       case 1, 2, 12 -> System.out.println("This winter");
       case 3, 4, 5 -> System.out.println("This spring");
       case 6, 7, 8 -> System.out.println("This summer");
       case 9, 10, 11 -> System.out.println("This autumn");
     }


  }

}
