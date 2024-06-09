package homework_35.petsappl.dao;

import homework_35.petsappl.pets.Pet;
import java.util.ArrayList;

public interface Hotel {

  boolean addPet(Pet pet);

  Pet removePet(int id);

  Pet findPet(String breed);

  boolean updatePet(int id, String nickname);

  int quantity();

  void print();

  double costOfStay(int id, double costPerDay, int numberOfDays);

  double hotelRevenue(int numberOfDays, double costPerDay);
}
