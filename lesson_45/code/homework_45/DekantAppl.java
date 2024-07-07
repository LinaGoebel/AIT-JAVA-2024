package homework_45;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import javax.sound.midi.Soundbank;

public class DekantAppl {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>(List.of(
        new Student(1, "Philip", "Thomas", LocalDate.of(2004, 5, 16),
            "Physik", 5, "England", "male", new int[]{2, 4, 1, 2}),
        new Student(7, "Andrew", "Dekens", LocalDate.of(2004, 1, 1),
            "Physik", 5, "Belgium", "male", new int[]{1, 3, 3, 1}),
        new Student(2, "Mark", "Ranbow", LocalDate.of(2005, 9, 24),
            "Bio", 2, "Australia", "male", new int[]{5, 4, 2, 3}),
        new Student(8, "Erik", "Teichman", LocalDate.of(2006, 7, 12),
            "Bio", 2, "Germany", "male", new int[]{4, 1, 3, 1}),
        new Student(3, "Raisa", "Fjodorova", LocalDate.of(2004, 10, 02),
            "Math", 1, "Russia", "female", new int[]{3, 2, 3, 1}),
        new Student(9, "Irina", "Rogova", LocalDate.of(2006, 3, 5),
            "Math", 1, "Russia", "female", new int[]{1, 2, 3, 1}),
        new Student(4, "Veronika", "Tree", LocalDate.of(2007, 4, 9),
            "IT", 3, "Brazil", "female", new int[]{2, 1, 1, 1}),
        new Student(10, "Kathrin", "Seifert", LocalDate.of(2005, 8, 16),
            "IT", 3, "Germany", "female", new int[]{1, 1, 1, 1}),
        new Student(5, "Dmitry", "Sokolov", LocalDate.of(2003, 11, 20),
            "Marketing", 8, "Belarus", "male", new int[]{1, 1, 1, 1}),
        new Student(11, "Sergej", "Lednjakow", LocalDate.of(2004, 5, 20),
            "Marketing", 8, "Belarus", "male", new int[]{1, 1, 1, 1}),
        new Student(6, "Jenny", "Stein", LocalDate.of(2006, 2, 28),
            "Physik", 6, "Germany", "female", new int[]{2, 2, 4, 1})
    ));
    System.out.println("--------------------List of students----------------------");
    students.stream()
        .sorted(Comparator.comparing(Student::getId))
        .forEach(System.out::println);
    System.out.println("-----------------List of student by course-------------------");
    Map<String, List<Student>> courses = students.stream()
        .collect(Collectors.groupingBy(Student::getCourse));

    courses.forEach((course, studentsList) -> {
      System.out.println("Course: " + course);
      studentsList.forEach(System.out::println);
      System.out.println();
    });
    System.out.println("----------------List of student by group-------------------");
    Map<Integer, List<Student>> groups = students.stream()
        .collect(Collectors.groupingBy(Student::getGroupNum));
    groups.forEach((group, studentsList) -> {
      System.out.println("Group: " + group);
      studentsList.forEach(System.out::println);
      System.out.println();
    });

    System.out.println("-----------Sorted by last name--------------");
    students.stream()
        .sorted(Comparator.comparing(Student::getLastName))
        .forEach(System.out::println);
    System.out.println("---------------Sorted by birth day---------------");

    students.stream()
        .sorted(Comparator.comparing(Student::getBirthDay))
        .forEach(System.out::println);
    System.out.println();

    long maleStudents = students.stream()
        .filter(s -> s.getGender().equals("male"))
        .count();
    System.out.println("Number of male students: " + maleStudents);

    long femaleStudents = students.stream()
        .filter(s -> s.getGender().equals("female"))
        .count();
    System.out.println("Number of female students: " + femaleStudents);

    double averageAge = students.stream()
        .mapToInt(s -> LocalDate.now().getYear() - s.getBirthDay().getYear())
        .average()
        .getAsDouble();
    System.out.printf("Average age of students: %.2f", averageAge);
    System.out.println();

    System.out.println("-----------Average marks of all students-------------------");

    double averageMarks = students.stream()
        .flatMapToInt(s -> Arrays.stream(s.getMarks()))
        .average()
        .getAsDouble();
    System.out.printf("Average marks of all students: %.2f%n", averageMarks);

    System.out.println("-----------Average marks of each student-------------------");
    students.forEach(student -> {
      OptionalDouble averageStudentMarks = Arrays.stream(student.getMarks())
          .average();
      System.out.printf("Average marks of student %s %s: %.2f%n", student.getFirstName(),
          student.getLastName(), averageStudentMarks.getAsDouble());
    });
  }
}
