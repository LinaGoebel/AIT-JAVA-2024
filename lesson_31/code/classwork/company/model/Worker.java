package classwork.company.model;

public class Worker extends Employee {

  private int grade;

  public Worker(int id, String firstName, String secondName, int age, double hours, int grade) {
    super(id, firstName, secondName, age, hours);
    this.grade = grade;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  @Override
  public double calcSalary() {
    double salary = hours * grade;
    return salary;
  }
}
