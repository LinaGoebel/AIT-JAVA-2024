package classwork;

import java.util.Scanner;

//Родители позволяют ребенку играть на компьютере 1 час. Напишите программу, которая будет
// реагировать на полученную в школе оценку:
//"Молодец!", время для игр на компьютере увеличивается на 30 мин.
//"Хорошо", ты можешь играть на компьютере обычные 60 минут.
//"Посредственно.", время для игр уменьшается на 30 мин.
//"Плохо!", сегодня никаких игр на компьютере.
//"Позор семьи!", никаких игр на компьютере 2 дня.
public class Evaluation {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Which mark have you got today? ");
    int mark = scanner.nextInt();

    int timeForGame = 60;

    switch (mark) {
      case 1: {
        System.out.println("Good job!");
        timeForGame = timeForGame + 30;
        System.out.println("Time for game: " + timeForGame);
        break;
      }
      case 2: {
        System.out.println("Good!");
        System.out.println("Time for game: " + timeForGame);
        break;
      }
      case 3: {
        System.out.println("Not so good!");
        timeForGame = timeForGame - 30;
        System.out.println("Time for game: " + timeForGame);
        break;

      }
      case 4: {
        System.out.println("Very bad!");
        timeForGame = 0;
        System.out.println("No game today!");
        break;

      }
      default: {
        System.out.println("Wrong input!");
      }
    }
  }
}
