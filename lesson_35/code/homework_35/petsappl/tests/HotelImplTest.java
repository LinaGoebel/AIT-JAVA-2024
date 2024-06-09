package homework_35.petsappl.tests;

import static org.junit.jupiter.api.Assertions.*;

import homework_35.petsappl.dao.HotelImpl;
import homework_35.petsappl.pets.Cat;
import homework_35.petsappl.pets.Dog;
import homework_35.petsappl.pets.Pet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HotelImplTest {

  HotelImpl hotelImpl;

  @BeforeEach
  void setUp() {
    hotelImpl = new HotelImpl(6);
    List<Pet> pets = List.of(
        new Dog(189, "Rex", "sheepdog", "black", "fetch"),
        new Dog(146, "Mini", "chihuahua", "grey", "sit"),
        new Cat(522, "Tinkerbell", "perseus", "white", false),
        new Cat(573, "Elsa", "perseus", "white-grey", true),
        new Cat(512, "Garfield", "brit", "black", true)
    );

    for (Pet pet : pets) {
      hotelImpl.addPet(pet);
    }
  }

  @Test
  void testComparator() {
    Comparator<Pet> comparator = (c1, c2) -> c1.getBreed().compareTo(c2.getBreed());
    System.out.println("======sorting by breed========");
    Collections.sort(hotelImpl.pets, comparator);
    hotelImpl.print();
    Comparator<Pet> comparator1 = (b1, b2) -> b1.getNickname().compareTo(b2.getNickname());
    System.out.println("======sorting by nickname========");
    Collections.sort(hotelImpl.pets, comparator1);
    hotelImpl.print();

  }

  @Test
  void addPet() {
    assertFalse(hotelImpl.addPet(null));
    Pet pet = new Dog(111, "Fido", "beagle", "red", "swim");
    assertTrue(hotelImpl.addPet(pet));
    assertEquals(6, hotelImpl.quantity());
    hotelImpl.print();
  }

  @Test
  void removePet() {
    System.out.println("=============Before remove=============");
    hotelImpl.print();
    hotelImpl.removePet(189);
    System.out.println("================After remove==============");
    assertEquals(4, hotelImpl.quantity());
    hotelImpl.print();

  }

  @Test
  void findPet() {
    System.out.println("finding a pet: " + hotelImpl.findPet("chihuahua"));
    assertEquals(new Dog(146, "Mini", "chihuahua", "grey", "sit"), hotelImpl.findPet("chihuahua"));
    System.out.println(
        "finding a pet that does breed \"dog\" not exist: " + hotelImpl.findPet("dog"));
    assertNull(hotelImpl.findPet("dog"));

  }

  @Test
  void updatePet() {
    assertTrue(hotelImpl.updatePet(189, "Rex"));
    hotelImpl.print();
    assertEquals("Rex", hotelImpl.findPet("sheepdog").getNickname());

  }

  @Test
  void quantity() {
    assertEquals(5, hotelImpl.quantity());
  }

  @Test
  void print() {
    hotelImpl.print();
  }

  @Test
  void costOfStay() {
    Pet pet = new Dog(189, "Rex", "sheepdog", "black", "fetch");
    assertEquals(500, hotelImpl.costOfStay(pet.getId(), 100, 5));
    pet = new Cat(573, "Elsa", "perseus", "white-grey", true);
    assertEquals(425, hotelImpl.costOfStay(pet.getId(), 85, 5));
  }

  @Test
  void hotelRevenue() {
    assertEquals(2500, hotelImpl.hotelRevenue(5, 100));

  }
}