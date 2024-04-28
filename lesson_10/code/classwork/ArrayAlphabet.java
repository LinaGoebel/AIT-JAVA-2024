package classwork;
// Создайте массив и заполните его символами латинского алфавита от A до Z. Раcпечатайте полученный массив.
public class ArrayAlphabet {

  public static void main(String[] args) {
    //заполним массив от 1 до 20
    int[] arrayNum = new int[20];//определили массив

    for (int i = 0; i < arrayNum.length; i++){ //заполнили массив данными
      arrayNum[i] = i + 1;

    }
    for (int i = 0; i < arrayNum.length; i++) {//печатаем
      System.out.print(arrayNum[i] + " | ");
    }
    System.out.println();

    char[] alphabet = new char[26];
    for (int i = 0; i < alphabet.length; i++) {
      alphabet[i] = (char) (65 + i);
      System.out.print(alphabet[i] + " | ");
    }
    System.out.println();
    System.out.println(alphabet);
  }
}
