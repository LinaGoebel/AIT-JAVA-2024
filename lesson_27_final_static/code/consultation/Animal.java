package consultation;

public abstract class Animal {

  String kind;
  String name;

  abstract void makeSound();
}

class Cat extends Animal {
  static final String TYPE = "cat";

  public Cat(String name) {
    this.name = name;
    kind = "cat";
  }

  @Override
  void makeSound() {

  }
}

class Dog extends Animal {
  static final String TYPE = "dog";

  public Dog(String name) {
    this.name = name;
    kind = "dog";
  }

  @Override
  void makeSound() {

  }
}
