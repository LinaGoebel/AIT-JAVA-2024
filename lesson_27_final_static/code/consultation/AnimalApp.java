package consultation;

public class AnimalApp {

  public static void main(String[] args) {
    Cat cat1 = new Cat("Marsik");
    Dog dog1 = new Dog("Jessy");
    Cat cat2 = new Cat("Leo");

    Animal[] animals = {cat1, dog1, cat2};
    for (Animal animal : animals) {
      System.out.println(animal.kind);

      if (animal.kind.equals(Cat.TYPE)) {
        System.out.println("meow");
      } else if (animal.kind.equals(Dog.TYPE)) {
        System.out.println("woof");
      }
    }
  }
}
