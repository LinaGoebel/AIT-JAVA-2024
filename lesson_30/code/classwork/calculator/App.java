package classwork.calculator;

public class App {

  public static void main(String[] args) {
    Calculator plus = new Calculator() {
      @Override
      public int operation(int a, int b) {
        return a + b;
      }
    };

    Calculator minus = new Calculator() {
      @Override
      public int operation(int a, int b) {
        return a - b;
      }
    };
    int resultSum = plus.operation(5, 6);
    System.out.println(resultSum);

    int resultDiff = minus.operation(3, 9);
    System.out.println(resultDiff);
  }

}
