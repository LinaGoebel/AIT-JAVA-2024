package homework_34;

import homework_34.todoappl.dao.ToDoListImpl;
import homework_34.todoappl.model.Menu;
import homework_34.todoappl.model.Task;
import java.time.LocalDateTime;
import java.util.Scanner;

public class toDoListAppl {

  public static void main(String[] args) {
    System.out.println("Welcome to ToDo Application!");
    ToDoListImpl toDoList = new ToDoListImpl(10);
    int id = 0;

    // начало цикла
    while (true) {
      // print menu
      Menu.printMenu(); // статический метод вызывается по имени класса
      // ask choice
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input your choice: ");
      int choice = scanner.nextInt();
      // execute
      switch (choice) {
        case 1: {
          scanner.nextLine();
          System.out.println("Input task: ");
          String task = scanner.nextLine();
          Task newTask = new Task(id++, task, id, LocalDateTime.now());
          toDoList.addTask(newTask);
          break;
        }
        case 2: {
          System.out.println("Your tasks: ");
          toDoList.viewTasks();
          break;
        }
        case 3: {
          System.out.println("Input task number to remove: ");
          int taskNumber = scanner.nextInt();
          Task removedTask = toDoList.removeTask(taskNumber - 1);
          System.out.println(removedTask + " is removed.");
          break;
        }
        case 4: {
          System.out.println("Input task number to edit: ");
          int taskNumber = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Input new task: ");
          String newTask = scanner.nextLine();
          toDoList.editTask(taskNumber - 1, newTask);
          break;
        }
        case 5: {
          System.out.println("Until next time. Bye!");
          return;
        }
        default: {
          System.out.println("Wrong input.");
        }
      }
    }
  }
}
