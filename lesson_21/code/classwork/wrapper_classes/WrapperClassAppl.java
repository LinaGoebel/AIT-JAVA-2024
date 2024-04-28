package classwork.wrapper_classes;

import homework.pet.Dog;
import java.math.BigInteger;

public class WrapperClassAppl {

  public static void main(String[] args) {

    int k = 1234567890;
    System.out.println(k);
    System.out.println("___________________");

    Integer myInt = new Integer("1234567890");
    System.out.println(myInt);
    System.out.println("_____________________________");

    BigInteger myBigInt = new BigInteger("123456789012345");
    System.out.println(myBigInt);
    System.out.println("___________________________");

    Integer x = 1_234_567_89;//Object typ Integer
    String str = x.toString();
    int l = str.length();
    System.out.println(x + " contains " + l + " symbols.");
    System.out.println("___________________________");
    System.out.println("Max value of Integer: " + x.MAX_VALUE);
    System.out.println("Mшт value of Integer: " + x.MIN_VALUE);
    System.out.println("______________________________");

    int n = 20;
    Integer m = 10;
    System.out.println("n = " + n);
    System.out.println("m = " + m);

    m = m + n;
    System.out.println("m + n = " + m);
    System.out.println("____________________________");

    Double pi = 3.14;
    double circleLength = 2 * pi * 10;
    System.out.printf("Length = %.2f\n", circleLength);
    System.out.println("____________________________");

    double a = 20.0 / 0;

    if(Double.isInfinite(a)){
      System.out.println("Wrong operation or incorrect result");
    }else {
      System.out.println(a);
    }
    System.out.println("_________________________________");

    System.out.println("Parsing String to number");
    String str1 = "0987654321";
    int num = Integer.parseInt(str1);
    System.out.println(num);
    System.out.println("_________________________________");

    String str2 = "2.7118281828";
    double exp = Double.parseDouble(str2);
    System.out.println("Exp = " + exp);
    System.out.println("_________________________________");


  }
}
