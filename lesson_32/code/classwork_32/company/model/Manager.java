package classwork_32.company.model;

public class Manager extends Employee {

  //fields
  private double baseSalary;
  private int grade;

  public Manager(int id, String firstName, String secondName, int age, double hours,
      double baseSalary, int grade) {
    super(id, firstName, secondName, age, hours);
    this.baseSalary = baseSalary;
    this.grade = grade;
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  @Override
  public double calcSalary() {
    double salary = baseSalary + hours * grade;
    return salary;
  }
}
