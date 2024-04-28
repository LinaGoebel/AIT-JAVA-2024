package classwork.firma;

import classwork.firma.model.Employee;

public class FirmaApplication {

  public static void main(String[] args) {
    Employee e1 = new Employee(1, "Leonid", "Big", 60, true, 7000);
    Employee e2 = new Employee(2, "Victoria", "Little", 35, false, 7500);
    Employee e3 = new Employee(3, "Paul", "Muller", 60, true, 6500);

    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);

    double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary();
    System.out.println("Total salary: " + totalSalary);

    e1.lunch();
    e2.work();
    e3.sleep();


    System.out.println( e1.getName());
    e1.work();
  }

}
