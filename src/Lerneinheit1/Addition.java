package Lerneinheit1;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x: ");
        int x = scanner.nextInt();

        System.out.println("y: ");
        int y = scanner.nextInt();

        scanner.close();

        int result = berechne(x, y);
        System.out.println("Das Endergebnis ist: " + result);
    }

    public static int berechne(int x, int y) {
        int s = x;
        int i = y;

        while (i != 0) {
            s = s + 1;
            i = i - 1;

            System.out.println("x = " + x + " y = " + y + " s = " + s + " i = " + i);
        }

        return s;
    }
}
