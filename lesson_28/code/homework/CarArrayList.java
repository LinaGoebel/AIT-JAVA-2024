package homework;

import classwork.IntArrayList;

public class CarArrayList implements ArrayList {

  private Car[] cars;
  public int size;
  private static final int DEFAULT_CAPACITY = 5;

  public CarArrayList() {
    this.cars = new Car[DEFAULT_CAPACITY];
    this.size = 0;
  }

  @Override
  public void add(Car value) {
    if (size == cars.length) {
      Car[] newCars = new Car[size * 2];
      System.arraycopy(cars, 0, newCars, 0, size);
      cars = newCars;
    }
    cars[size++] = value;
  }

  @Override
  public Car get(int index) {
    if (index < 0 || index >= size) {
      return this.cars[-1];
    }
    return cars[index];
  }

  @Override
  public Car remove(int index) {
    if (index < 0 || index >= size) {
      return this.cars[-1];
    }
    Car removedCar = cars[index];
    for (int i = index; i < size - 1; i++) {
      cars[i] = cars[i + 1];
    }
    cars[size - 1] = null;
    size--;
    return removedCar;
  }
}