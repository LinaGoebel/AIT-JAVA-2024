package classwork.interfaces;

public class AbstarctExample1 {

}

abstract class Animal {

  abstract void makeSound();
}

class Cat extends Animal {

  @Override
  void makeSound() {
    System.out.println("meow");
  }
}
