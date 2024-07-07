package classwork_41.treeset;

import java.util.TreeSet;

public class TreeSetExampleNumbers {

  public static void main(String[] args) {
    //загрузить в TreeSet 10 случайных целых чисел и понять:
    // - это Set?
    // - имеется ли порядок в этом множестве?
    TreeSet<Integer> numbers = new TreeSet<>();
    //add elements
    numbers.add(8);
    numbers.add(-7);
    numbers.add(15);
    numbers.add(41);
    numbers.add(65);
    numbers.add(245);
    numbers.add(69);
    numbers.add(987);
    numbers.add(-7);
    numbers.add(245);
    //elements of tree set
    System.out.println(numbers);
    numbers.remove(245);
    System.out.println(numbers);
    numbers.contains(15);
    System.out.println(numbers.contains(15));

    numbers.first();
    System.out.println(numbers.first());

    System.out.println(numbers.ceiling(10));
    System.out.println(numbers.floor(50));
  }

}