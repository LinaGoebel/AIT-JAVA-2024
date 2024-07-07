package classwork_42.car_garage.dao;

import classwork_42.car_garage.model.Car;

public class GarageImpl implements Garage {

  private Car[] cars;
  private int size;

  public GarageImpl(int capacity) {
    cars = new Car[capacity];
    this.size = 0;
  }

  @Override
  public boolean addCar(Car car) {
    if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
      return false;
    }
    cars[size++] = car;
    return true;
  }

  @Override
  public Car removeCar(String regNumber) {
    for (int i = 0; i < size; i++) {
      if (regNumber.equals(cars[i].getRegNumber())) {
        Car temp = cars[i];
        cars[i] = cars[--size];
        cars[size] = null;
        return temp;
      }

    }
    return null;
  }

  @Override
  public Car findCarByRegNumber(String regNumber) {
    for (int i = 0; i < size; i++) {
      if (cars[i].getRegNumber().equals(regNumber)) {
        return cars[i];
      }
    }
    return null;
  }

  @Override
  public Car[] findCarsByModel(String model) {
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (cars[i].getModel().equals(model)) {
        count++;
      }
    }
    Car[] temp = new Car[count];
    int j = 0;
    for (int i = 0; i < size; i++) {
      if (cars[i].getModel().equals(model)) {
        temp[j] = cars[i];
        j++;
      }
    }
    return temp;
  }

  @Override
  public Car[] findCarsByCompany(String company) {
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (cars[i].getCompany().equals(company)) {
        count++;
      }
    }
    Car[] temp = new Car[count];
    int j = 0;
    for (int i = 0; i < size; i++) {
      if (cars[i].getCompany().equals(company)) {
        temp[j] = cars[i];
        j++;
      }
    }
    return temp;
  }

  @Override
  public Car[] findCarsByColor(String color) {
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (cars[i].getColor().equals(color)) {
        count++;
      }
    }
    Car[] temp = new Car[count];
    int j = 0;
    for (int i = 0; i < size; i++) {
      if (cars[i].getColor().equals(color)) {
        temp[j] = cars[i];
        j++;
      }
    }
    return temp;
  }

  @Override
  public Car[] findCarsByEngine(double min, double max) {
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (cars[i].getEngine() > min && cars[i].getEngine() < max) {
        count++;
      }
    }
    Car[] temp = new Car[count];
    int j = 0;
    for (int i = 0; i < size; i++) {
      if (cars[i].getEngine() > min && cars[i].getEngine() < max) {
        temp[j] = cars[i];
        j++;
      }
    }
    return temp;
  }

}