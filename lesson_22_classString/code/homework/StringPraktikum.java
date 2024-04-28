package homework;
//Преобразуйте строку к нижнему регистру.
//Вырезать подстроку Java c помощью метода substring().
//Проверить, заканчивается ли строка подстрокой “!!!”.
//Проверить, начинается ли строка подстрокой “I'm proud".
public class StringPraktikum {

  public static void main(String[] args) {
    String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
    System.out.println(str);
    //Распечатать последний символ строки.
    char c = str.charAt(str.length() - 1);
    System.out.println("Last Character of the Line: " + c);
    System.out.println("----------------------------------");
    //Найти позицию подстроки “Java” в строке.
    int index = str.indexOf("Java");
    System.out.println("The position of the \"Java\" substring in the string: " + index);
    System.out.println("----------------------------------");
    //Проверить, содержит ли заданная строка подстроку “Java”.
    String substring = "Java";
    if (str.contains(substring)) {
      System.out.println("The string contains the substring 'Java'");
    } else {
      System.out.println("The string does not contain the 'Java' substring");
    }
    System.out.println("----------------------------------");
    //Заменить все символы “o” на “a”.
    System.out.println(str.replace('o', 'a'));
    System.out.println(str + "  :String with replaced \"o\" with \"a\"");
    System.out.println("----------------------------------");
    //Преобразуйте строку к верхнему регистру.
    String upperCase = str.toUpperCase();
    System.out.println(upperCase + "  :Converted string to uppercase.");
    System.out.println("----------------------------------");
  }
}


