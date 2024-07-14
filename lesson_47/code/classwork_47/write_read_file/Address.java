package classwork_47.write_read_file;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {

  String city;
  String postCode;
  String street;
  int buildingNumber;
  int apartment;

  public Address(String city, String postCode, String street, int buildingNumber, int apartment) {
    this.city = city;
    this.postCode = postCode;
    this.street = street;
    this.buildingNumber = buildingNumber;
    this.apartment = apartment;
  }

  public String getCity() {
    return city;
  }

  public String getPostCode() {
    return postCode;
  }

  public String getStreet() {
    return street;
  }

  public int getBuildingNumber() {
    return buildingNumber;
  }

  public int getApartment() {
    return apartment;
  }

  @Override
  public String toString() {
    return "Address{" +
        "city='" + city + '\'' +
        ", postCode='" + postCode + '\'' +
        ", street='" + street + '\'' +
        ", buildingNumber=" + buildingNumber +
        ", apartment=" + apartment +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Address address)) {
      return false;
    }
    return buildingNumber == address.buildingNumber && apartment == address.apartment
        && Objects.equals(postCode, address.postCode) && Objects.equals(street,
        address.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postCode, street, buildingNumber, apartment);
  }
}
