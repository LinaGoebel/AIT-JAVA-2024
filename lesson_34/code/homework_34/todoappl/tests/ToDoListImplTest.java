package homework_34.todoappl.tests;

import static org.junit.jupiter.api.Assertions.*;

import homework_34.todoappl.dao.ToDoListImpl;
import homework_34.todoappl.model.Task;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoListImplTest {

  ToDoListImpl toDoList;

  @BeforeEach
  void setUp() {
    toDoList = new ToDoListImpl(6);
    List<Task> tasks = List.of(
        new Task(0, "Learn Java", 1, LocalDateTime.now().plusHours(4)),
        new Task(1, "Make tests", 2, LocalDateTime.now().plusDays(2)),
        new Task(2, "Make homework", 3, LocalDateTime.now().plusDays(1)),
        new Task(3, "Go to work", 4, LocalDateTime.now().plusDays(5)),
        new Task(4, "Go to sleep", 5, LocalDateTime.now().plusHours(6))
    );

    for (Task task : tasks) {
      toDoList.addTask(task);
    }
  }

  @Test
  void addTask() {
    assertFalse(toDoList.addTask(null));
    Task task = new Task(6, "Go to bed", 6, LocalDateTime.now().plusHours(2));//
    assertTrue(toDoList.addTask(task));
    assertEquals(6, toDoList.quantity());
    toDoList.print();
  }

  @Test
  void removeTask() {
    assertEquals(1, toDoList.removeTask(1).getId());
    assertEquals(4, toDoList.quantity());
    toDoList.print();
  }

  @Test
  void viewTasks() {
    toDoList.viewTasks();
    assertEquals(5, toDoList.quantity());

  }

  @Test
  void editTask() {
    System.out.println("Edit task: " + toDoList.getTask(2));
    boolean result = toDoList.editTask(2, "Call a doctor");
    assertTrue(result, "Failed to edit task");
    Task editedTask = toDoList.getTask(2);
    assertNotNull(editedTask, "Failed to find edited task");
    assertEquals("Call a doctor", editedTask.getTask(), "Failed to edit task");
    toDoList.print();
  }

  @Test
  void quantity() {
    assertEquals(5, toDoList.quantity());
  }
}