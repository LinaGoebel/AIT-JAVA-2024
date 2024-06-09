package homework_34.todoappl.dao;


import homework_34.todoappl.dao.ToDoList;
import homework_34.todoappl.model.Task;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToDoListImpl implements ToDoList {

  private List<Task> tasks;
  private int capacity;
  private int quantity;
  private LocalDateTime time;

  public ToDoListImpl(int capacity) {
    this.capacity = capacity;
    tasks = new ArrayList<>(capacity);
    this.time = LocalDateTime.now();
  }


  @Override
  public boolean addTask(Task task) {
    if (task == null || tasks.size() >= capacity) {
      return false;
    }
    tasks.add(task); // Используем add вместо set
    quantity++;
    Collections.sort(tasks);
    return true;
  }

  @Override
  public Task removeTask(int id) {
    List<Task> tasksRemove = new ArrayList<>();
    for(Task task : tasks){
      if(task.getId() == id){
        tasksRemove.add(task);
      }
    }
    for (Task task : tasks) {
      if (task.getId() == id) {
        tasks.remove(task);
        quantity--;
        return task;
      }
    }
    return null;
  }


  @Override
  public void viewTasks() {
    for (Task task : tasks) {
      System.out.println(task);
    }
    System.out.println("You have " + quantity + " tasks");
  }

  @Override
  public boolean editTask(int taskNumber, String newTask) {
    for (Task task : tasks) {
      if (task.getTaskNumber() == taskNumber) {
        task.setTask(newTask);
        return true;
      }
    }
    return false;
  }

  @Override
  public int quantity() {
    return tasks.size();
  }

  @Override
  public void print() {
    for (Task task : tasks) {
      System.out.println(task);
    }
  }

  public Task getTask(int taskNumber) {
    for(Task task : tasks){
      if(task.getTaskNumber() == taskNumber){
        return task;
      }
    }
    return null;
  }
}
