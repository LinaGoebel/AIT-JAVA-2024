package homework_34.todoappl.dao;

import homework_34.todoappl.model.Task;

public interface ToDoList {

  boolean addTask(Task task);
  Task removeTask(int taskNumber);
  void viewTasks();
  boolean editTask(int taskNumber, String newTask);

  int quantity();
  void print();

}
