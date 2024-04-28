package homework;

// Бросьте кубик с 6-ю гранями 20 раз. Подсчитайте, сколько раз выпала каждая цифра.
// Посчитайте вероятность выпадения каждой грани.
public class _6SidedDie {

  public static void main(String[] args) {
    int[] die = new int[20];
    int a = 1;
    int b = 6;

    ArrMethods.fillArray(die, a, b);
    ArrMethods.printArray(die);

    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    int number6 = 0;

    for (int i = 0; i < die.length; i++) {
      int count = die[i];
      switch (count) {
        case 1 -> number1++;
        case 2 -> number2++;
        case 3 -> number3++;
        case 4 -> number4++;
        case 5 -> number5++;
        case 6 -> number6++;
      }
    }
    System.out.println("Digit 1 = " + number1 + "  possibility: " + (double) number1 / die.length);
    System.out.println("Digit 2 = " + number2 + "  possibility: " + (double) number2 / die.length);
    System.out.println("Digit 3 = " + number3 + "  possibility: " + (double) number3 / die.length);
    System.out.println("Digit 4 = " + number4 + "  possibility: " + (double) number4 / die.length);
    System.out.println("Digit 5 = " + number5 + "  possibility: " + (double) number5 / die.length);
    System.out.println("Digit 6 = " + number6 + "  possibility: " + (double) number6 / die.length);
  }
}
