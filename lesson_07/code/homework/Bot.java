package homework;

import java.util.Scanner;

public class Bot {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the 'Zolotoy Khutorok' restaurant.\n"
        + "You can only book from wednesday to sunday. And please note our working hours. \n"
        + "Enter the day: ");
    java.lang.String bookDay = scanner.nextLine();
    if (bookDay.equals("monday") || bookDay.equals("tuesday")) {
      System.out.println("We're closed.");
      return;
    }

    int time = 0;
    bookDay(bookDay, time);

    System.out.println("What time do you want to come?");
    time = scanner.nextInt();
    if(bookDay(bookDay,time)){
      return;
    }

    System.out.println("How many people come? ");
    int person = scanner.nextInt();

    System.out.println("We look forward to seeing you on " + bookDay + " at " + time + " hours. "
        + "Your table reserved for " + person + " people");
  }

  public static boolean bookDay(String day, int time) {
      switch (day) {
        case "wednesday", "thursday" -> {
          System.out.println("We are open from 14 hours to 21");
          if (time < 14 || time > 21) {
            System.out.println("Please note our working hours.");
            return true;
          }
        }
        case "friday", "saturday" -> {
          System.out.println("We are open from 17 to 24");
          if (time < 17 || time > 24) {
            System.out.println("Please note our working hours.");
            return true;
          }
        }
        case "sunday" -> {
          System.out.println("We are open from 13 to 22");
          if (time < 13 || time > 22) {
            System.out.println("Please note our working hours.");
            return true;
          }
        }
        default -> System.out.println("Wrong input.");

      }

    return false;
  }
}



