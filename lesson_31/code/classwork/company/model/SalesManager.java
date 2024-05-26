package classwork.company.model;

public class SalesManager extends Employee {

  private double salesRevenue;
  private double percent;

  public SalesManager(int id, String firstName, String secondName, int age, double hours,
      double salesRevenue, double percent) {
    super(id, firstName, secondName, age, hours);
    this.salesRevenue = salesRevenue;
    this.percent = percent;
  }

  public double getSalesRevenue() {
    return salesRevenue;
  }

  public void setSalesRevenue(double salesRevenue) {
    this.salesRevenue = salesRevenue;
  }

  public double getPercent() {
    return percent;
  }

  public void setPercent(double percent) {
    this.percent = percent;
  }

  @Override
  public double calcSalary() {
    double salary = salesRevenue * percent;
    return salary;
  }
}
