package homework;

//Штрих-код имеет строго регламентированную длину, то есть количество цифр,
// которое в нем содержится (обычно это 8 или 13 цифр). Создать класс Code, в котором реализовать методы:
//lengthCode(long code), который возвращает длину штрих-кода
//controlSum(long code), который возвращает сумму всех цифр штрих кода
//isValid(long code), который проверяет штрих-код на правильное количество цифр
public class Code {
  private long code;

  public Code(long code) {
    this.code = code;

  }
  public int lengthCode() {
    long count = 0;
    long tempCode = code;
    while (tempCode > 0) {
      tempCode = tempCode / 10;
      count++;
    }
    System.out.println("Length code = " + count);
    return (int) count;
  }

  public int controlSum() {
    int sum = 0;
    long tempCode = code;
    while (tempCode > 0) {
      sum += tempCode % 10;
      tempCode = tempCode / 10;
    }
    System.out.println("Control sum = " + sum);
    return sum;
  }

  public void isValid() {
    int length = lengthCode();
    if (length == 8 || length == 13) {
      System.out.println("long code is valid");
    } else {
      System.out.println("Wrong input");
    }
  }
}
