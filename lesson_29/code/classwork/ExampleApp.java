package classwork;

import classwork.OuterClass.StaticNestedClass;

public class ExampleApp {

  public static void main(String[] args) {

    OuterClass.StaticNestedClass staticNestedClassObjeckt;
    staticNestedClassObjeckt = new StaticNestedClass();
    staticNestedClassObjeckt.display();
    System.out.println("__________________________________");
    OuterClass outerClassObject = new OuterClass();
    OuterClass.InnerClass innerClassObject = outerClassObject.new InnerClass();
    innerClassObject.display();
  }

}
