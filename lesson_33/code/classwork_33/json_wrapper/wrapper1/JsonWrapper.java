package classwork_33.json_wrapper.wrapper1;

public class JsonWrapper {

  //{"value": value} -this is json
  //field
  private Object value;

  public JsonWrapper(Object value) {
    this.value = value;
  }

  public Object getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "{value: " + value + "}";
  }
}
