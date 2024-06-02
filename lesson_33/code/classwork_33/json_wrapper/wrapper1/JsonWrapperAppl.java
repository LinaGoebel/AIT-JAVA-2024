package classwork_33.json_wrapper.wrapper1;

public class JsonWrapperAppl {

  public static void main(String[] args) {
    JsonWrapper wrapper = new JsonWrapper("10");
    System.out.println(wrapper);
    System.out.println("============================");

   String a = (String) wrapper.getValue();
    System.out.println(a);
  }

}
