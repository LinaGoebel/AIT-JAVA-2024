package homework_34.todoappl.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Task implements Comparable<Task> {

  @Override
  public int compareTo(Task o) {
    return Integer.compare(this.getTaskNumber(), o.getTaskNumber());//compare by number
  }

  private int id;
  private String task;
  private int taskNumber;
  private static int currentId = 0;
  private LocalDateTime time;
  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

  public Task(int id, String task, int taskNumber, LocalDateTime time) {
    this.id = currentId++;//increase ID when creating a task
    this.task = task;
    this.taskNumber = taskNumber;
    this.time = time;
  }

  public static int getCurrentId() {
    return currentId;
  }

  public static void setCurrentId(int currentId) {
    Task.currentId = currentId;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public int getTaskNumber() {
    return taskNumber;
  }

  public void setTaskNumber(int taskNumber) {
    this.taskNumber = taskNumber;
  }

  @Override
  public String toString() {
    return "Task: " +
        "id = " + id +
        ", task = '" + task + '\'' +
        ", task number = " + taskNumber +
        ", time = " + time.format(formatter);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Task task)) {
      return false;
    }
    return id == task.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
