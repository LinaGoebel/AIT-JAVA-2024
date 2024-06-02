package classwork_33.json_wrapper.wrapper2;

public class JsonWrapperAppl2 {

  public static void main(String[] args) {
    JsonWrapper2<String> wrapper2 = new JsonWrapper2("10");
    System.out.println(wrapper2.getValue() + " Hello");

    JsonWrapper2<Integer> wrapper3 = new JsonWrapper2<>(100);
    System.out.println(wrapper3.getValue() * 3);
  }
}
