package homework.student;

public class Student {

  private int id;
  private String name;
  private String lastName;
  private int yearOfBirth;
  private String specialization;

  public Student(int id, String name, String lastName, int yearOfBirth, String specialization) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
    this.specialization = specialization;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public void displayStudent() {
    System.out.println(
        "Id: " + id + ", name: " + name + ", surname: " + lastName + ", year of birth: " +
            yearOfBirth + ", specialization: " + specialization);
  }

  public void study() {
    System.out.println("Student study...");
  }

  public void takeAVacation() {
    System.out.println("The student took a leave of absence");
  }

  public void passTheExam() {
    System.out.println("Student took the exam");
  }
}
