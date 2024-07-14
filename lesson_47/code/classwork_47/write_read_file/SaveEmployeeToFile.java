package classwork_47.write_read_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import javax.imageio.IIOException;

public class SaveEmployeeToFile {

  //create a few objects
  //save to file
  public static void main(String[] args) {

    Address address1 = new Address("Wassen", "27211", "Kaizer Str.", 12, 2);
    Address address2 = new Address("Bremen", "27215", "Karl Marks Str.", 34, 15);

    Employee e1 = new Employee(1, "Peter", "Vogel", 32, 2900, address1);
    Employee e2 = new Employee(2, "Mikhael", "Müller", 35, 3100, address2);

    Set<Employee> employees = new HashSet<>();
    employees.add(e1);
    employees.add(e2);

    File destDir = new File("./dest");
    if (!destDir.exists()) {
      destDir.mkdir();
    }
    // Новый объект на базе класса ObjectOutputStream
    try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("./dest/employee.dat"))) {
      oos.writeObject(employees);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}
