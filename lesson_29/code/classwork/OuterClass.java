package classwork;

public class OuterClass {
  private static String staticField = "static Field";
  private String field = "not static Field";

  static class StaticNestedClass{
    private static String nestedStaticField = "inserted static field";
    private String nestedField = "inserted field";
    void display(){
      System.out.println(staticField);
     // System.out.println(field);//error
      System.out.println(nestedStaticField);
      System.out.println(nestedField);
    }
  }

  class InnerClass{
    private String innerField = "inner Field";
   // private static String innerStaticField; error
    void display(){
      System.out.println(staticField);
      System.out.println(field);
      System.out.println(this.innerField);
      System.out.println(OuterClass.StaticNestedClass.nestedStaticField);

    }
  }

}
