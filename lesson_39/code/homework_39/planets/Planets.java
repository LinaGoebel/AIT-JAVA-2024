package homework_39.planets;

import java.util.Objects;

//Name;
//distance to the Sun;
//mass;
//number of satellites. Display a list of planets sorted by:
//order of location in the solar system;
//alphabet;
//mass;
//number of satellites.
public class Planets implements Comparable<Planets> {

  private String name;
  private double distanceToSun;
  private double mass;
  private int numberOfSatellites;


  public Planets(String name, double distanceToSun, double mass, int numberOfSatellites) {
    this.name = name;
    this.distanceToSun = distanceToSun;
    this.mass = mass;
    this.numberOfSatellites = numberOfSatellites;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDistanceToSun() {
    return distanceToSun;
  }

  public void setDistanceToSun(int distanceToSun) {
    this.distanceToSun = distanceToSun;
  }

  public double getMass() {
    return mass;
  }

  public void setMass(int mass) {
    this.mass = mass;
  }

  public int getNumberOfSatellites() {
    return numberOfSatellites;
  }

  public void setNumberOfSatellites(int numberOfSatellites) {
    this.numberOfSatellites = numberOfSatellites;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Planets planets)) {
      return false;
    }
    return Objects.equals(name, planets.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "Planets{" +
        "name='" + name + '\'' +
        ", distanceToSun=" + distanceToSun +
        ", mass=" + mass +
        ", numberOfSatellites=" + numberOfSatellites +
        '}';
  }

  @Override
  public int compareTo(Planets o) {
    int res = this.name.compareTo(o.name);
    return  res != 0 ? res : Integer.compare((int) this.mass, (int) o.mass);

  }
}
