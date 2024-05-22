package classwork.calculator;

public class LambdaApp {

  public static void main(String[] args) {
    Calculator plus = (a, b) -> a + b;
    Calculator minus = (a, b) -> a - b;

    int resultSum = plus.operation(5, 6);
    System.out.println(resultSum);

    int resultDiff = minus.operation(3, 9);
    System.out.println(resultDiff);
  }

}


