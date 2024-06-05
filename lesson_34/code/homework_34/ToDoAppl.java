package homework_34;

import java.util.Scanner;

public class ToDoAppl {

  public static void main(String[] args) {
    ToDoListImpl toDoAppl = new ToDoListImpl(4);
    Task[] tasks = new Task[3];
    tasks[0] = new Task(101, "Learn Java", 1);
    tasks[1] = new Task(102, "Water plants", 2);
    tasks[2] = new Task(103, "Take a PAUSE", 3);
    for (Task task : tasks) {
      toDoAppl.addTask(task);
    }
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello, my friend. What can I do for you?");

    Menu[] menu = Menu.values();
    Menu.printMenu();

    System.out.println("Input your choice or 0 to exit: ");

    while (true) {
      int choice = scanner.nextInt();
      String changeTask = scanner.nextLine();
      switch (choice) {
        case 1 -> {
          System.out.println(
              "Here you are: " + menu[choice - 1].getAction() + ".");
          System.out.println("You to do list: ");
          System.out.println(toDoAppl.print());

          Task newTask = new Task(104, "Go to market", 4);
          Task newTask2 = new Task(105, "Go to work", 5);
          System.out.println("Add Task: ");
          System.out.println(newTask);
          System.out.println(newTask2);
          System.out.println("Which task do you want to add? Task number 4 or 5: ");
          int choice2 = scanner.nextInt();
          if (choice2 == 4) {
            toDoAppl.addTask(newTask);
          }
          if (choice2 == 5) {
            toDoAppl.addTask(newTask2);
          } else {
            System.out.println("Wrong choice");
          }
          System.out.println("Update Task: ");
          System.out.println(toDoAppl.print());


        }
        case 2 -> {
          System.out.println(
              "Here you are: " + menu[choice - 1].getAction() + ".");
          System.out.println("You to do list: ");
          toDoAppl.printUpdateTasks();
        }

        case 3 -> {
          System.out.println(
              "Here you are: " + menu[choice - 1].getAction() + ".");
          toDoAppl.print();
          toDoAppl.printUpdateTasks();
          System.out.println("Input number of task you want to delete: ");
          int[] deleteEntry = new int[1];
          deleteEntry[0] = scanner.nextInt();
          toDoAppl.deleteEntry(deleteEntry[0]);
          System.out.println("Your new to do list: ");
          toDoAppl.printUpdateTasks();

        }
        case 4 -> {
          System.out.println(
              "Here you are: " + menu[choice - 1].getAction() + ".");
          toDoAppl.print();
          toDoAppl.printUpdateTasks();
          System.out.println("Input number of task you want to edit: ");
          int taskNumber = scanner.nextInt();
          System.out.println("Input new task: ");
          scanner.nextLine();
          String newTask = scanner.nextLine();
          toDoAppl.editTask(taskNumber, newTask);
          System.out.println("Your new to do list: ");
          toDoAppl.printUpdateTasks();
        }
        case 5 -> {
          System.out.println(
              "Here you are: " + menu[choice - 1].getAction() + ".");
          toDoAppl.goOut();

        }
        default -> System.out.println("Wrong choice.");
      }
      if (choice == 0) {
        System.out.println("Good bye.");
        break;
      }
    }
    scanner.close();
  }
}

