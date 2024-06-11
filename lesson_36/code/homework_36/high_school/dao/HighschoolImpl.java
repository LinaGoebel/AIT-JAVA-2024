package homework_36.high_school.dao;

import homework_36.high_school.academic_community.model.Aspirant;
import homework_36.high_school.academic_community.model.Person;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighschoolImpl implements HighSchool {

  public List<Person> persons;
  private int size;
  private int capacity;

  public HighschoolImpl(int capacity) {
    this.capacity = capacity;
    persons = new ArrayList<>(capacity);

  }

  @Override
  public boolean addPerson(Person person) {
    if (person != null && persons.size() < capacity) {
      persons.add(person);
      Collections.sort(persons);
      size++;
      return true;

    }
    return false;
  }

  @Override
  public Person removePerson(int id) {
    for (Person person : persons) {
      if (person.getId() == id) {
        persons.remove(person);
        return person;
      }
    }
    return null;
  }

  @Override
  public Person findPerson(int id) {
    for (Person person : persons) {
      if (person.getId() == id) {
        return person;
      }
    }
    return null;
  }

  @Override
  public int quantity() {
    return persons.size();
  }

  @Override
  public double totalSalary() {
    double res = 0;
    for (Person person : persons) {
      res += person.calcSalary();
    }
    return res;
  }

  @Override
  public double avgSalary() {
    return totalSalary() / persons.size();
  }

  @Override
  public Person updatePerson(int id, String rolle) {
    for (Person person : persons) {
      if (person.getId() == id) {
        person.setRolle(rolle);
        return person;
      }
    }
    return null;
  }

  @Override
  public void printPerson() {
    for (Person person : persons) {
      System.out.println(person);
    }

  }

  @Override
  public List<Person> findPersonByRolle(String rolle) {
    List<Person> foundPersons = new ArrayList<>();
    for (Person person : persons) {
      if (person.getRolle().equals(rolle)) {
        foundPersons.add(person);
      }
    }
    return foundPersons;
  }


  @Override
  public List<Person> findPersonByHighSalary(double salary) {
    List<Person> personByHighSalary = new ArrayList<>();
    for (Person person : persons) {
      if (person.getSalary() > salary) {
        personByHighSalary.add(person);
      }
    }
    return personByHighSalary;
  }

  @Override
  public List<Person> findPersonByStartDate(LocalDate startDate) {
    List<Person> personByStartDate = new ArrayList<>();
    for (Person person : persons) {
      if (person.getStartDate().isAfter(startDate)) {
        personByStartDate.add(person);
      }
    }
    return personByStartDate;
  }
}
