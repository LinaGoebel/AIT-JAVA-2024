package homework_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

// Какие специализации есть у каждого врача?
// Какие специализации наиболее популярны среди врачей в клинике?
public class DoctorAppl {

  public static void main(String[] args) {
    List<Doctor> doctors = getDoctors();
    System.out.println("-------------Print all doctors-------------");
    printDoctorsList(doctors);
    System.out.println();
    printMostPopularSpecialties(doctors);
    System.out.println();
    printMostSkilledDoctor(doctors);
    System.out.println();
  }

  private static void printMostSkilledDoctor(List<Doctor> doctors) {
    Map<Integer, List<Doctor>> skilledDoctor = doctors.stream()
        .collect(Collectors.groupingBy(d -> d.getSpecialties().length));
    Integer max = skilledDoctor.keySet().stream()
        .max(Integer::compareTo).orElse(0);

    for (Doctor doctor : doctors) {
      int key = doctor.getSpecialties().length;
      max = key > max ? key : max;
      skilledDoctor.putIfAbsent(key, new ArrayList<>());
      List<Doctor> doctorList = skilledDoctor.get(key);

    }
    System.out.println(
        "Doctor with most specialties: " + skilledDoctor.get(max) + "Number of specialties: "
            + max);
    System.out.println("--------------Doctor with number of specialties-------------");
    System.out.println(skilledDoctor);
  }

  private static void printMostPopularSpecialties(List<Doctor> doctors) {
    System.out.println("-----------Print all specialties-----------");
    Iterable<String> specialties = doctors.stream()
        .map(d -> d.getSpecialties())
        .flatMap(Stream::of)
        .collect(Collectors.toList());
    System.out.println(specialties);

    System.out.println("-----------List of specialties-----------");
    StreamSupport.stream(specialties.spliterator(), false)
        .distinct()
        .forEach(System.out::println
        );
    System.out.println("-----------Grouping by doctors-----------");
    Map<String, Long> specialtyFrequency = doctors.stream()
        .map(Doctor::getSpecialties)
        .flatMap(Arrays::stream)
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

    System.out.println(specialtyFrequency);

    System.out.println("-----------Most popular specialty-----------");

    Long max = specialtyFrequency.values().stream()
        .max(Long::compare).orElse(0L);

    specialtyFrequency.entrySet().stream()
        .filter(e -> max.equals(e.getValue()))
        .forEach(e -> System.out.println(e.getKey()));
  }


  private static void printDoctorsList(List<Doctor> doctors) {
    doctors.forEach(System.out::println);
  }

  private static List<Doctor> getDoctors() {
    return List.of(
        new Doctor("Kevin", "Dermatologist", "Anesthesiologist", "Internist"),
        new Doctor("Irina", "Nephrologist", "Neurologist"),
        new Doctor("Mandy", "Dermatologist", "Endocrinologist ", "Nephrologist",
            "Gastroenterologist "),
        new Doctor("Thomas", "Dermatologist", "Internist", "Anesthesiologist"),
        new Doctor("Elen", "Internist", "Neurologist", "Endocrinologist", "Dermatologist",
            "Anesthesiologist")
    );
  }

}
