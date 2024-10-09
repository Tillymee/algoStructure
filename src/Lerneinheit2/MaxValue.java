package Lerneinheit2;
import java.util.Scanner;

public class MaxValue {
    public static int findMaximum(int[] a) {
        int m = 0;
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                m = i;
            }
        }

        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Größe des Arrays ein: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Gib die Elemente des Arrays ein:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int indexOfMax = findMaximum(array);
        System.out.println("Der Index des Maximums ist: " + indexOfMax);
    }
}
