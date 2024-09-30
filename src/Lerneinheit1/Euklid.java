package Lerneinheit1;

import java.util.Scanner;

public class Euklid {

  public static Integer getEuklid(int a, int b) {
    System.out.println("Starting GCD calculation for " + a + " and " + b);

    // Continue the loop until a and b are equal
    while (a != b) {
      if (a > b) {
        System.out.println(a + " - " + b + " = " + (a - b)); // Show the step
        a = a - b;
      } else {
        System.out.println(b + " - " + a + " = " + (b - a)); // Show the step
        b = b - a;
      }
    }

    System.out.println("GCD found: " + a);
    return a; // Return the greatest common divisor
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int a = sc.nextInt();

    System.out.println("Enter second number: ");
    int b = sc.nextInt();

    // Call the getEuklid method and print the result
    System.out.println("GCD of " + a + " and " + b + ": " + Euklid.getEuklid(a, b).toString());

    sc.close();
  }
}
