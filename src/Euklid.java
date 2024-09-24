import java.util.Scanner;

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
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int a = sc.nextInt();

    System.out.println("Enter second number: ");
    int b = sc.nextInt();

    System.out.println("GCD of " + a + " and " + b + ": " + Euklid.getEuklid(a, b).toString());

    sc.close();

  }
}

