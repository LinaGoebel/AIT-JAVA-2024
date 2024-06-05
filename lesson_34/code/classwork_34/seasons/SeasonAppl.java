package classwork_34.seasons;

public class SeasonAppl {

  public static void main(String[] args) {
    //Опробовать на нем методы:
    // .values()
    // .toString
    // .ordinal()
    // .valueOf()
    Season[] seasons = Season.values();//fields array
    for (int i = 0; i < seasons.length; i++) {
      System.out.println(seasons[i].getName() + ". " + seasons[i].getNumber());
    }
    //foreach
    for (Season s : seasons) {
      System.out.println(s.getName() + ". " + s.getNumber());
    }
    //toString
    System.out.println("========toString============");
    String str = Season.AUTUMN.toString();
    System.out.println(str);

    System.out.println("======ordinal()===============");
    int n = Season.AUTUMN.ordinal();//return index
    System.out.println(n);

    System.out.println("======valueOf()===============");
    Season s = Season.valueOf("AUTUMN");
    System.out.println(s);
  }
}
