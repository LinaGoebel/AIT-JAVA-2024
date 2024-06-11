package homework_36.high_school.dao;

import homework_36.high_school.academic_community.model.Person;
import java.time.LocalDate;
import java.util.List;

public interface HighSchool {
  boolean addPerson(Person person);
  Person removePerson(int id);
  Person findPerson(int id);
  int  quantity();
  double totalSalary();
  double avgSalary();

  Person updatePerson(int id, String rolle);
  void printPerson();

  List<Person> findPersonByRolle(String rolle);
  List<Person> findPersonByHighSalary(double salary);
  List<Person> findPersonByStartDate(LocalDate startDate);
}
