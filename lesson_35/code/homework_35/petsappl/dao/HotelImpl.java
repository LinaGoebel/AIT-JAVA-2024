package homework_35.petsappl.dao;

import homework_35.petsappl.pets.Pet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelImpl implements Hotel {


  public List<Pet> pets;
  private int capacity;


  public HotelImpl(int capacity) {
    this.capacity = capacity;
    pets = new ArrayList<>(capacity);
  }

  @Override
  public boolean addPet(Pet pet) {
    if (pet == null || pets.size() >= capacity) {
      return false;
    }
    pets.add(pet);
    Collections.sort(pets);
    return true;
  }

  @Override
  public Pet removePet(int id) {
    List<Pet> petsToRemove = new ArrayList<>();
    Pet petToRemove = null;
    for (Pet pet : pets) {
      if (pet.getId() == id) {
        petsToRemove.add(pet);
        petToRemove = pet;
      }
    }
    if (petToRemove != null) {
      pets.removeAll(petsToRemove);
      return petToRemove;
    }
    return null;
  }

  @Override
  public Pet findPet(String breed) {
    for (Pet pet : pets) {
      if (pet.getBreed().equals(breed)) {
        return pet;
      }
    }
    return null;
  }

  @Override
  public boolean updatePet(int id, String nickname) {
    for (Pet pet : pets) {
      if (pet.getId() == id) {
        pet.setNickname(nickname);
        return true;
      }
    }

    return false;
  }

  @Override
  public int quantity() {
    return pets.size();
  }


  @Override
  public void print() {
    for (Pet pet : pets) {
      System.out.println(pet);
    }
  }

  @Override
  public double costOfStay(int id, double costPerDay, int numberOfDays) {
    for (Pet pet : pets) {
      if (pet.getId() == id) {
        return costPerDay * numberOfDays;
      }
    }
    return 0;
  }

  @Override
  public double hotelRevenue(int numberOfDays, double costPerDay) {
    double totalRevenue = 0;
    for (Pet pet : pets) {
      totalRevenue += costOfStay(pet.getId(), costPerDay, numberOfDays);
    }
    return totalRevenue;
  }
}
