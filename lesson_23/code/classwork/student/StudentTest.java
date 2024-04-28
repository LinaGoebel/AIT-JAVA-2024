package classwork.student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {
  // Student student = new Student();

  Student student; // создаём объект из тестированного класса

  @BeforeEach
  void setUp() {
    student = new Student();
  }

  @Test
  void avrScore() {
    int[] marks = {1, 2, 1, 3, 2, 1, 6, 5, 4, 2};
    assertEquals(2.7, student.avrScore(marks));
  }
}