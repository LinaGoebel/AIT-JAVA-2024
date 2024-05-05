package consultation;

public class Animal {

  String kind;
  String name;

}

class Cat extends Animal {
  static final String TYPE = "cat";

  public Cat(String name) {
    this.name = name;
    kind = "cat";
  }
}

class Dog extends Animal {
  static final String TYPE = "dog";

  public Dog(String name) {
    this.name = name;
    kind = "dog";
  }
}
