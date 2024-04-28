package homework.student;

public class StudentAppl {

  public static void main(String[] args) {
    Student s1 = new Student(1, "Leo", "Musterman", 2006, "IT");
    Student s2 = new Student(2, "Maria", "Müller", 2003, "Police");
    Student s3 = new Student(3, "Nico", "Ivanov", 2008, "lawyer");

    s1.displayStudent();
    s2.displayStudent();
    s3.displayStudent();
  }
}
