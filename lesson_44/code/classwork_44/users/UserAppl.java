package classwork_44.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Ваша задача - создать список пользователей
// выполнить фильтрацию с помощью лямбда-выражений и вывести результат на экран.
// Найти всех пользователей старше 18 лет.
// Найти всех пользователей младше 30 лет с именем, начинающимся на букву "A".
public class UserAppl {

  public static void main(String[] args) {
    List<User> userList = Arrays.asList(
        new User("Alice", 25),
        new User("Bob", 15),
        new User("Alex", 22),
        new User("Victoria", 19),
        new User("Paul", 60),
        new User("Yulia", 18),
        new User("Lina", 30)
    );
    for (User u : userList) {
      System.out.println(u);
    }
    System.out.println("______________________");

    List<User> usersGrater18Age = findUserBeiPredicate(userList, user -> user.getAge() > 18);
    for (User user : usersGrater18Age) {
      System.out.println(user);
    }
    System.out.println("___________________");
    List<User> usersYounger30StartsA = findUserBeiPredicate(userList,
        user -> user.getAge() < 30 && user.getLogin().charAt(0) == 'A');
    for(User user: usersYounger30StartsA){
      System.out.println(user);
    }
  }

  private static List<User> findUserBeiPredicate(List<User> userList, Predicate<User> predicate) {
    List<User> resList = new ArrayList<>();
    for (User user : userList) {
      if (predicate.test(user)) {
        resList.add(user);
      }
    }
    return resList;
  }
}
