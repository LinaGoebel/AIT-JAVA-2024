package homework_36.high_school.test;

import static org.junit.jupiter.api.Assertions.*;

import homework_36.high_school.academic_community.model.Aspirant;
import homework_36.high_school.academic_community.model.Person;
import homework_36.high_school.academic_community.model.Professor;
import homework_36.high_school.academic_community.model.Student;
import homework_36.high_school.dao.HighschoolImpl;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HighschoolImplTest {

  HighschoolImpl highschool;

  @BeforeEach
  void setUp() {
    highschool = new HighschoolImpl(7);
    List<Person> persons = List.of(
        new Student(128, "John", "Doe", 18, "Male", "john.doe@example.com",
            "1234567890", "Student", 12.14, LocalDate.of(2021, 9, 13),
            2, 3.8, "Computer Science"),
        new Student(146, "Alice", "Johnson", 17, "Female", "alice.johnson@example.com",
            "1234567890", "Student", 12.14, LocalDate.of(2022, 10, 1),
            1, 3.9, "Biology"),
        new Aspirant(489, "Jane", "Smith", 25, "Female", "jane.smith@example.com",
            "9876543210", "Aspirant", 20.99, LocalDate.of(2021, 9, 1),
            4, "Machine Learning", 4.5),
        new Aspirant(365, "Bob", "Smith", 28, "Male", "bob.smith@example.com",
            "9876543210", "Aspirant", 20.99, LocalDate.of(2021, 9, 1),
            5, "Physics", 4.8),
        new Professor(891, "David", "Brown", 40, "Male", "david.brown@example.com",
            "5556667777", "Professor", 70.49, LocalDate.of(2001, 4, 25),
            "Associate Professor", 10, "Computer Science", "Artificial Intelligence"),
        new Professor(756, "Carol", "Williams", 35, "Female", "carol.williams@example.com",
            "5556667777", "Professor", 70.79, LocalDate.of(2008, 8, 28),
            "Professor", 12, "Chemistry", "Organic Chemistry")
    );
    for (Person person : persons) {
      highschool.addPerson(person);
    }
  }

  @Test
  void testComparator() {
    Comparator<Person> comparator = (p1, p2) -> p1.getId() - p2.getId();
    System.out.println("==============Sorting by id==============");
    Collections.sort(highschool.persons, comparator);
    highschool.printPerson();
    Comparator<Person> comparator1 = (b1, b2) -> b1.getLastName().compareTo(b2.getLastName());
    System.out.println("==============Sorting by last name==============");
    Collections.sort(highschool.persons, comparator1);
    highschool.printPerson();
  }

  @Test
  void addPerson() {
    assertFalse(highschool.addPerson(null));
    Person person = new Student(129, "Marie", "Fischer", 19, "Female", "marie.fischer@example.com",
        "1234567890", "Student", 12.14, LocalDate.of(2023, 9, 13),
        1, 2.8, "Information Technology");
    assertTrue(highschool.addPerson(person));
    assertEquals(7, highschool.quantity());
    highschool.printPerson();
  }

  @Test
  void removePerson() {
    System.out.println("=============before remove=============");
    highschool.printPerson();
    highschool.removePerson(128);
    System.out.println("=============after remove=============");
    assertEquals(5, highschool.quantity());
    highschool.printPerson();
  }

  @Test
  void findPerson() {
    Person person = new Student(128, "John", "Doe", 18, "Male", "john.doe@example.com",
        "1234567890", "Student", 12.14, LocalDate.of(2021, 9, 13),
        2, 3.8, "Computer Science");
    assertEquals(person, highschool.findPerson(128));
    assertNull(highschool.findPerson(007));
  }

  @Test
  void quantity() {
    assertEquals(6, highschool.quantity());
  }

  @Test
  void totalSalary() {
    System.out.println("Total salary: " + highschool.totalSalary());
    assertEquals(102766, highschool.totalSalary());
  }

  @Test
  void avgSalary() {
    System.out.printf("Average salary: %.2f", highschool.avgSalary());
    assertEquals(17127.666666666668, highschool.avgSalary());
  }

  @Test
  void updatePerson() {
    Person person = new Student(128, "John", "Doe", 18, "Male", "john.doe@example.com",
        "1234567890", "Student", 12.14, LocalDate.of(2021, 9, 13),
        2, 3.8, "Computer Science");
    System.out.println("Before update:" + person);
    person.setRolle("Aspirant");
    highschool.updatePerson(128, person.getRolle());
    person = highschool.findPerson(128);
    assertEquals(person, highschool.findPerson(128));
    System.out.println("After update:" + person);
    assertEquals("Aspirant", person.getRolle());
  }

  @Test
  void printPerson() {
    highschool.printPerson();
  }

  @Test
  void findPersonByRolle() {
    List<Person> persons = highschool.findPersonByRolle("Professor");
    assertEquals(2, persons.size());
    for (Person person : persons) {
      System.out.println(person);
    }
  }

  @Test
  void findPersonByHighSalary() {
    System.out.println("=============Persons with salary > 20==============");
    List<Person> persons = highschool.findPersonByHighSalary(20);
    Person[] expected = { new Aspirant(489, "Jane", "Smith", 25, "Female", "jane.smith@example.com",
        "9876543210", "Aspirant", 20.99, LocalDate.of(2021, 9, 1),
        4, "Machine Learning", 4.5),
        new Aspirant(365, "Bob", "Smith", 28, "Male", "bob.smith@example.com",
            "9876543210", "Aspirant", 20.99, LocalDate.of(2021, 9, 1),
            5, "Physics", 4.8),
        new Professor(891, "David", "Brown", 40, "Male", "david.brown@example.com",
            "5556667777", "Professor", 70.49, LocalDate.of(2001, 4, 25),
            "Associate Professor", 10, "Computer Science", "Artificial Intelligence"),
        new Professor(756, "Carol", "Williams", 35, "Female", "carol.williams@example.com",
            "5556667777", "Professor", 70.79, LocalDate.of(2008, 8, 28),
            "Professor", 12, "Chemistry", "Organic Chemistry")

    };
    assertArrayEquals(expected, persons.toArray());
    for (Person person : persons) {
      System.out.println(person);
    }
  }

  @Test
  void findPersonByStartDate() {
    System.out.println("=============Persons with start date > 2020==============");
    List<Person> persons = highschool.findPersonByStartDate(LocalDate.of(2020, 1, 1));
   assertArrayEquals(persons.toArray(), highschool.findPersonByStartDate(LocalDate.of(2020, 1, 1)).toArray());
    for (Person person : persons) {
      System.out.println(person);
    }
  }
}