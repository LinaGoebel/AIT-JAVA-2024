package homework;

import java.util.Arrays;

public class ArrAppl {

  public static void main(String[] args) {
    //1.
    String[] strings = {"Java", "Arrays", "Homework", "Out"};
    System.out.println("The shortest and longest string of the original array: " +
        Arrays.toString(ArrMethods.arrayOfStrings(strings)));
    //2.
    int[] array ={0, 1, 2, 3, 4 , 5, 6};
    System.out.println("The new array: " +
                        Arrays.toString(ArrMethods.copyOfArray(array, 3)));
  }
}
