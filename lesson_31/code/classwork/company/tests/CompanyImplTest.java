package classwork.company.tests;

import static org.junit.jupiter.api.Assertions.*;

import classwork.company.dao.Company;
import classwork.company.dao.CompanyImpl;
import classwork.company.model.Employee;
import classwork.company.model.Manager;
import classwork.company.model.SalesManager;
import classwork.company.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompanyImplTest {

  Company company;
  Employee[] e;

  @BeforeEach
  void setUp() {
    company = new CompanyImpl(5);
    e = new Employee[4];
    e[0] = new Manager(101, "John", "Smith", 45, 168, 5000, 5);
    e[1] = new SalesManager(102, "Anna", "Black", 36, 160, 25000, 0.1);
    e[2] = new SalesManager(103, "Thomas", "White", 28, 160, 30000, 0.1);
    e[3] = new Worker(104, "Hans", "Bauer", 30, 80, 5);

    for (int i = 0; i < e.length; i++) {
      company.addEmployee(e[i]);
    }
  }

  @Test
  void addEmployee() {
    assertFalse(company.addEmployee(null));
    assertFalse(company.addEmployee(e[1]));
    Employee employee = new Manager(105, "Ivan", "Dubinin", 55, 160, 6000, 6);
    assertTrue(company.addEmployee(employee));
    assertEquals(5, company.quantity());
    Employee employeeOneMore = new Worker(106, "Leon", "Klein", 45, 80, 5);
    assertFalse(company.addEmployee(employeeOneMore));
    company.printEmployee();


  }

  @Test
  void removeEmployee() {
  }

  @Test
  void findEmployee() {
  }

  @Test
  void quantity() {
  }

  @Test
  void totalSalary() {
  }

  @Test
  void avgSalary() {
  }

  @Test
  void totalSales() {
  }

  @Test
  void printEmployee() {
  }

  @Test
  void findEmployeeHoursGreaterThen() {
  }

  @Test
  void findEmployeeSalaryRange() {
  }
}