package homework_34;

public interface ToDoList {

  void addTask(Task task);

  Task[] seeAllTasks();

  boolean deleteEntry(int taskNumber);

  boolean editTask(int taskNumber, String newTask);

  boolean goOut();

  String print();
}
