package classwork.company.dao;

import classwork.company.model.Employee;

public interface  Company {

  //define abstract methods
  boolean addEmployee(Employee employee);
  Employee removeEmployee(int id);
  Employee findEmployee(int id);
  int quantity();//quantity of employees
  double totalSalary();
  double avgSalary();
  double totalSales();
  void printEmployee();

  Employee[] findEmployeeHoursGreaterThen(int hours);
  Employee[] findEmployeeSalaryRange(double min, double max);
}
