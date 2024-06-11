package homework_36.high_school.academic_community.model;

import java.time.LocalDate;

public class Professor extends Person {

  private String title;
  private int yearsOfExperience;
  private String department;
  private String specialization;

  public Professor(int id, String firstName, String lastName, int age, String gender, String email,
      String phoneNumber, String rolle, double salary, LocalDate startDate, String title,
      int yearsOfExperience, String department, String specialization) {
    super(id, firstName, lastName, age, gender, email, phoneNumber, rolle, salary, startDate);
    this.title = title;
    this.yearsOfExperience = yearsOfExperience;
    this.department = department;
    this.specialization = specialization;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Professor ");
    sb.append(super.toString());
    sb.append("title='").append(title);
    sb.append(", yearsOfExperience=").append(yearsOfExperience);
    sb.append(", department='").append(department);
    sb.append(", specialization='").append(specialization);
    return sb.toString();
  }

  @Override
  public double calcSalary() {
    double salary = 2500 * yearsOfExperience + 800 * specialization.length();
    return salary;
  }
}
