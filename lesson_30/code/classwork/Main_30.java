package classwork;


class MyBestClass implements Greeting{

  @Override
  public void sayHello() {
    System.out.println("Hello from MyBestClass");
  }
}

public class Main_30 {
  public static void main(String[] args) {
    MyBestClass myObject = new MyBestClass();
    myObject.sayHello();

    Greeting myObject2 = new MyBestClass();
    myObject2.sayHello();
  }


}
