public class Euklid {

  public static Integer getEuklid(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println("8,3: " + Euklid.getEuklid(555, 444).toString());
  }
}

