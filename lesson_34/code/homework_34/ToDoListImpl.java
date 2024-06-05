package homework_34;

public class ToDoListImpl implements ToDoList {

  private Task[] tasks;
  private int size;

  public ToDoListImpl(int capacity) {
    tasks = new Task[capacity];
  }

  @Override
  public void addTask(Task task) {
    if (task == null || size >= tasks.length) {
      return;
    }
    tasks[size] = new Task(size, task.getTask(), size);
    size++;

  }

  @Override
  public Task[] seeAllTasks() {
    Task[] result = new Task[size];
    for (int i = 0; i < size; i++) {
      result[i] = tasks[i];
    }
    return result;
  }

  @Override
  public boolean deleteEntry(int taskNumber) {
    for (int i = 0; i < size; i++) {
      if (tasks[i].getTaskNumber() == taskNumber) {
        tasks[i] = null;
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean editTask(int taskNumber, String newTask) {
    for (int i = 0; i < size; i++) {
      if (tasks[i].getTaskNumber() == taskNumber) {
        tasks[i].setTask(newTask);
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean goOut() {
    System.out.println("Until next time. Bye!");
    return true;
  }

  @Override
  public String print() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < size; i++) {
      sb.append(tasks[i]).append("\n");
    }
    return sb.toString();
  }

  public void printUpdateTasks() {
    if (size == 0) {
      System.out.println("No tasks");
    } else {
      for (int i = 0; i < size; i++) {
        if (tasks[i] != null) {
          System.out.println(tasks[i]);
        }
      }
    }
  }
}


 /* private Task[] tasks;
  private int size;

  public ToDoListImpl(int capacity) {
    tasks = new Task[capacity];
  }

  @Override
  public void addNote(String note) {
    if (note == null || size >= tasks.length) {
      return;
    }
    tasks[size] = new Task(size, note, size);
    size++;
  }

  @Override
  public Task[] seeAllPosts(int id) {
    int count = 0;

    for (Task task : tasks) {
      if (task.getId() == id) {
        count++;
      }
    }
    Task[] result = new Task[count];
    count = 0;
    for (Task task : tasks) {
      if (task.getId() == id) {
        result[count] = task;
        count++;
      }
    }
    return result;
  }


  @Override
  public Task[] deleteEntry(int number) {
    for (int i = 0; i < size; i++) {
      if (tasks[i].getTaskNumber() == number) {
        tasks[i] = tasks[size - 1];
        tasks[size - 1] = null;
        size--;
        break;
      }
    }
    return new Task[0];
  }

  @Override
  public void editTask(int number, String newTask) {
    for (int i = 0; i < size; i++) {
      if (tasks[i].getTaskNumber() == number) {
        tasks[i].setTask(newTask);
        break;
      }
    }
  }

  @Override
  public void goOut() {
    for (int i = 0; i < size; i++) {
      tasks[i] = null;
    }
    size = 0;
    System.out.println("All tasks have been deleted. The work is completed.");
  }

  @Override
  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(tasks[i]);
    }
  }
}*/
