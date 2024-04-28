package classwork;

import java.util.Objects;

public class StringExample {

  public static void main(String[] args) {
    String shoppingList = "";
    shoppingList = shoppingList + "Milch";
    shoppingList = shoppingList + ", Eier";
    shoppingList = shoppingList + ", Brot";
    shoppingList = shoppingList + ", Schokolade";

    System.out.println("Einkaufsliste: " + shoppingList);
  }
}

class StringBuilderExample {

  public static void main(String[] args) {
    StringBuilder shoppinglist = new StringBuilder();
    shoppinglist.append("Milch");
    shoppinglist.append(", Eier");
    shoppinglist.append(", Brot");
    shoppinglist.append(", Schokolade");
    System.out.println("Einkaufsliste: " + shoppinglist.toString());
  }
}

class StringBuilderExample2 {

  public static void main(String[] args) {
    StringBuilder str = new StringBuilder();
    str.append("a");
    str.append(" cat");
    str.insert(0, "I have ");
    //  str.delete(7, 10);
    int i = str.indexOf("cat");
    str.delete(i, i + 3);

    int haveIndex = str.indexOf("have");
    str.replace(haveIndex, haveIndex + 4, "had");

    str.append("headache");

    System.out.println(str.toString());
    System.out.println(str.reverse().toString());
  }
}
class User{
  String name;
  int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof User user)) {
      return false;
    }
    return age == user.age && Objects.equals(name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
class UserExample{

  public static void main(String[] args) {
    User user1 = new User("Karl", 100);
    User user2 = new User("Karl", 101 );

    System.out.println(user1.equals(user2));
    System.out.println("hash user1 = " + user1.hashCode());
    System.out.println("hash user2 = " + user2.hashCode());
  }
}