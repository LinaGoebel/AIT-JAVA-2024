package homework;

//Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов:
// byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов
// основной функции main.
//Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести
// максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double).
//Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.
public class MinMaxValues {

  public static void main(String[] args) {

    if (args.length == 0) {
      printMinMaxValues();
    } else {
      convertArgyment(args);
    }
  }

  private static void printMinMaxValues() {
    System.out.println("Byte: Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
    System.out.println("Short: Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
    System.out.println("Char: Min = " + Character.MIN_VALUE + ", Max = " + Character.MAX_VALUE);
    System.out.println("Int: Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
    System.out.println("Long: Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
    System.out.println("Float: Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
    System.out.println("Double: Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
  }

  private static void convertArgyment(String[] args) {
    for (int i = 0; i < args.length; i++) {
      switch (args[i]) {
        case "byte" -> {
          System.out.println("Byte: Min = " + Byte.MIN_VALUE);
          System.out.println("Byte: Max = " + Byte.MAX_VALUE);
        }
        case "Short" -> {
          System.out.println("Short: Min = " + Short.MIN_VALUE);
          System.out.println("Short: Max = " + Short.MAX_VALUE);
        }
        case "Char" -> {
          System.out.println("Char: Min = " + Character.MIN_VALUE);
          System.out.println("Char: Max = " + Character.MAX_VALUE);
        }
        case "Int" -> {
          System.out.println("Int: Min = " + Integer.MIN_VALUE);
          System.out.println("Int: Max = " + Integer.MAX_VALUE);
        }
        case "Long" -> {
          System.out.println("Long: Min = " + Long.MIN_VALUE);
          System.out.println("Long: Max = " + Long.MAX_VALUE);
        }
        case "Float" -> {
          System.out.println("Float: Min = " + Float.MIN_VALUE);
          System.out.println("Float: Max = " + Float.MAX_VALUE);
        }
        case "Double" -> {
          System.out.println("Double: Min = " + Double.MIN_VALUE);
          System.out.println("Double: Max = " + Double.MAX_VALUE);
        }
        default -> System.out.println("Wrong input " + args[i]);
      }
    }
  }
}
