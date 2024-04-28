package homework;
// Чему равно значение выражения x-- + --x при x = 5? Проверьте свое предположение с помощью кода.
public class ValueOfTheExpression {

  public static void main(String[] args) {
    int x = 5;
    int y = x-- + --x;
    System.out.println("y = " + y);
  }

}
