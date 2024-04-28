package homework;

//Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.
public class InputString {

  public static void main(String[] args) {
    String str = "Hello World!";
    int i = 7;
    int count = 0;

    while (count < i) {
      System.out.println(str);
      count++;
    }
    System.out.println("The line " + "'" + str + "'" + " was printed " + count + " times.");
  }
}
