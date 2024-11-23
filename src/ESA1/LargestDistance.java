package ESA1;

import java.util.Scanner;

public class LargestDistance {

    public static int largestDistance(int[] A, int n) {
        int largest = 0;
        int z = A[0];
        int comparisons = 0; // Zähler für die Anzahl der Vergleiche
        int updates = 0;     // Zähler für die Anzahl der Aktualisierungen von largest und z

        System.out.println("Debug-Ausgabe: Vergleiche starten...");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                comparisons++; // Zähle jeden Vergleich
                if (A[i] == A[j]) {
                    if ((j - i) > largest) {
                        largest = j - i;
                        z = A[j];
                        updates++; // Zähle jede Aktualisierung
                        System.out.println("Aktualisierung: largest = " + largest + ", z = " + z);
                    }
                }
            }
        }

        System.out.println("Gesamtanzahl der Vergleiche: " + comparisons);
        System.out.println("Gesamtanzahl der Aktualisierungen: " + updates);
        return z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Länge des Arrays ein:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Geben Sie die Elemente des Arrays ein:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int result = largestDistance(array, n);
        System.out.println("Das Element mit der größten Entfernung ist: " + result);

        scanner.close();
    }
}
