package classwork;

//Проверка положительное или отрицательное число. Проверка четное или нечетное целое число.
// Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо прийти вместе с
// вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно.
public class Conditions {

  public static void main(String[] args) {
    int n = 55;

    if (n > 0) {
      System.out.println(n + " - this is POSITIVE number.");
    } else {
      System.out.println(n + " - this is NEGATIV number.");
    }

    int daten = - 44;

    if (daten % 2 == 1 | daten % 2 == -1) {
      System.out.println(daten + " - is odd number.");
    } else {
      System.out.println(daten + " - is even number.");
    }

    int age = 17;

    if(age >= 18){
      System.out.println("Вам разрешено действовать самостоятельно.");
    }else {
      System.out.println("Вам надо прийти вместе с вашим опекуном.");
    }
  }

}
