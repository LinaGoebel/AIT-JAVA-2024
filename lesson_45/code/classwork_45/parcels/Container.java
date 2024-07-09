package classwork_45.parcels;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Container implements Iterable<Box> {

  private String label;
  private List<Box> boxes;

  public Container(String label, int numBoxes) {
    this.label = label;
    Random random = new Random();
    // цикл от 0 до numBox-1, создает новые коробки
    this.boxes = IntStream.range(0, numBoxes)
        .mapToObj(i -> new Box(random.nextInt(5, 11)))
        .toList();// занесли в лист
  }

  // кол-во посылок в контейнере
  public int getTotalParcels() {
    return boxes.stream()
        .mapToInt(box -> box.parcels.size())
        .sum();
  }

  public String getLabel() {
    return label;
  }

  public List<Box> getBoxes() {
    return boxes;
  }

  // добавление Box
  // добавляем коробку в список коробок
  public boolean addBox(Box box) {
    return boxes.add(box);
  }

  public double weightContainer() {
    return boxes.stream()
        .mapToDouble(b -> b.weightBox())
        .sum();
  }

  public int quantity() {
    return boxes.size();
  }

  public int countParcels() {
    return boxes.stream()
        .mapToInt(p -> p.quantity())
        .sum();
  }

  // // @Override
// public String toString() {
//   final StringBuilder sb = new StringBuilder("Container{");
//   sb.append("label='").append(label).append('\'');
//   sb.append(", boxes=").append(boxes);
//   sb.append(", parcels=").append(countParcels());
//   sb.append('}');
//   return sb.toString();
  @Override
  public String toString() {
    return "Container label " + label + ", parcels = " + countParcels();
  }

  @Override
  public Iterator<Box> iterator() {
    return boxes.iterator();
  }
}
