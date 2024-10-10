package Lerneinheit2;

import java.util.Scanner;

public class GaussSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ganze Zahl n: ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // sum = sum + i
        }
        System.out.println("Sum: " + sum);

        input.close();
    }

}
