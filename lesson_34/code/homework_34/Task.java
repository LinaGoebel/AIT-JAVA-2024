package homework_34;

import java.util.Objects;

public class Task implements Comparable<Task> {

  @Override
  public int compareTo(Task o) {
    int res = this.taskNumber - o.getTaskNumber();
    return res;
  }

  private int id;
  private String task;
  private int taskNumber;

  public Task(int id, String task, int taskNumber) {
    this.id = id;
    this.task = task;
    this.taskNumber = taskNumber;
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
        ", task number = " + taskNumber;
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
