package classwork;

import classwork.IntArrayList;

public class IntArrayListApp {

  public static void main(String[] args) {
    IntArrayList myArray = new IntArrayList();
    myArray.add(3);
    myArray.add(1);
    myArray.add(8);
    myArray.add(9);
    myArray.add(6);
    myArray.add(48);

    System.out.println(myArray);

    int removedValue = myArray.remove(2);
    System.out.println("remove value: " + removedValue);
    System.out.println(myArray);

    myArray.add(88);
    System.out.println(myArray);
    System.out.println("The end");
  }

}
