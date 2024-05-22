package classwork;

public class AnonymousExampleApp {

  public static void main(String[] args) {
    Greeting myObject = new Greeting(){
      @Override
      public void sayHello(){
        System.out.println("Hello from anonymous class");
      }
    };
    myObject.sayHello();
  }
}
