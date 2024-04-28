package homework.cube;
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class CubeAppl {

  public static void main(String[] args) {
    Cube cube = new Cube(12.5);

    cube.perimeter();
    cube.area();
    cube.volume();
  }

}
