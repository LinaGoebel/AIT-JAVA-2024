package homework;

import classwork.ArrayMethods;
import java.util.Random;
import java.util.Scanner;

//Задача про поиск "счастливого пельменя". Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.
public class Peljmeni {

  public static void main(String[] args) {
    int[] arrPeljmeni = new int[30];
    int coinWeight = 15;


    Random random = new Random();
    int indexPelm = random.nextInt(30);

    for (int i = 0; i < arrPeljmeni.length; i++) {
      arrPeljmeni[i] = 100;
    }
    arrPeljmeni[indexPelm] += coinWeight;
    int luckyDumpling = 100 + coinWeight;

    for (int i = 0; i < arrPeljmeni.length; i++) {
      if (arrPeljmeni[i] == luckyDumpling) {
        System.out.println("You have a lucky dumpling at position " + (i + 1));
        return;
      }
    }
    System.out.println("No lucky dumpling found");
  }
}
