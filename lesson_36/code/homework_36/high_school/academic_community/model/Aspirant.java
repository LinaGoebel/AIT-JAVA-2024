package homework_36.high_school.academic_community.model;

import java.time.LocalDate;

public class Aspirant extends Person {

  private int yearsOfStudy;
  private String specialty;
  private double graduationMark;

  public Aspirant(int id, String firstName, String lastName, int age, String gender, String email,
      String phoneNumber, String rolle, double salary, LocalDate startDate,
      int yearsOfStudy, String specialty, double graduationMark) {
    super(id, firstName, lastName, age, gender, email, phoneNumber, rolle, salary, startDate);
    this.yearsOfStudy = yearsOfStudy;
    this.specialty = specialty;
    this.graduationMark = graduationMark;
  }

  @Override
  public double calcSalary() {
    double salary = 1000 * yearsOfStudy + 500 * graduationMark;
    return salary;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Aspirant: ");
    sb.append(super.toString());
    sb.append("yearsOfStudy=").append(yearsOfStudy);
    sb.append(", specialty='").append(specialty);
    sb.append(", graduationMark=").append(graduationMark);
    return sb.toString();
  }

}
