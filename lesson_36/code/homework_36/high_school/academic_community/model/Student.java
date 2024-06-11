package homework_36.high_school.academic_community.model;

import java.time.LocalDate;

public class Student extends Person {

  private int yearOfStudy;
  private double averageGrade;
  private String faculty;

  public Student(int id, String firstName, String lastName, int age, String gender, String email,
      String phoneNumber, String rolle, double salary, LocalDate startDate, int yearOfStudy,
      double averageGrade, String faculty) {
    super(id, firstName, lastName, age, gender, email, phoneNumber, rolle, salary, startDate);
    this.yearOfStudy = yearOfStudy;
    this.averageGrade = averageGrade;
    this.faculty = faculty;
  }

  public int getYearOfStudy() {
    return yearOfStudy;
  }

  public void setYearOfStudy(int yearOfStudy) {
    this.yearOfStudy = yearOfStudy;
  }

  public double getAverageGrade() {
    return averageGrade;
  }

  public void setAverageGrade(double averageGrade) {
    this.averageGrade = averageGrade;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  @Override
  public double calcSalary() {
    double salary = 500 * yearOfStudy + 80 * averageGrade;
    return salary;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("Student: ");
    sb.append(super.toString());
    sb.append("yearOfStudy=").append(yearOfStudy);
    sb.append(", averageGrade=").append(averageGrade);
    sb.append(", faculty='").append(faculty);
    return sb.toString();
  }
}
