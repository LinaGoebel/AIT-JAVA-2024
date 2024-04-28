package classwork.arguments;

public class ArgsApplExample {

  public static void main(String[] args) {
    // main - это метод типа void
// в скобках - это аргументы метода
// String[] - массив строк, его зовут args
    String str1 = args[0];
    int num1 = Integer.parseInt(str1);

    String str2 = args[1];
    int num2 = Integer.parseInt(str2);

    System.out.println(str1 + " * " + str2 + " = " + num1 * num2);
    System.out.println("___________________________________________________________");

    String string1 = Integer.toHexString(254);
    System.out.println("254 в 16-ой системе = " + string1);

    String string2 = Long.toOctalString(254);
    System.out.println("254 в  8-ой системе = " + string2);

    String string3 = Long.toBinaryString(254);
    System.out.println("254 в  2-ой системе = " + string3);
  }

}
