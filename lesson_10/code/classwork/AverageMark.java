package classwork;
//Имеются оценки абитуриента из его аттестата, всего 20 оценок. Найдите средний балл абитуриента.
public class AverageMark {

  public static void main(String[] args) {
    int[] marks = {1, 2, 1, 2, 3, 2, 1, 3, 4, 1, 2, 3, 1, 2, 2, 6, 2, 4, 1, 2};
    System.out.println(marks.length);

    int sumOfMarks = 0;

    for (int i = 0; i < marks.length; i++) {
      sumOfMarks += marks[i];
    }
    double averageMark = (double) sumOfMarks / marks.length;

    System.out.println("Average mark: " + averageMark);
    System.out.printf("Average mark: %.2f", averageMark);
  }
}
