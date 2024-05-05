package classwork.final_example;

public class Main {

  public static void main(String[] args) {
    final String name = "qwerty";
   // name = "rrrrrrrr"; вызывает ошибку, мы не можем переопределять final переменные
    System.out.println(name);
  }

}
