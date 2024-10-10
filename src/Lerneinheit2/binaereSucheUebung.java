package Lerneinheit2;

import java.util.Arrays;
import java.util.Scanner;

public class binaereSucheUebung {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Gib die Anzahl der Elemente im Array ein: ");
        int n = scan.nextInt();

        // Erstellen des Arrays
        int[] A = new int[n];

        // Eingabe Array-Werte
        System.out.println("Gib die Elemente des Arrays ein: ");
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }

        // Sortiere das Array
        Arrays.sort(A);
        System.out.println("Sortiertes Array: " + Arrays.toString(A));

        // Eingabe des Suchschlüssels
        System.out.println("Suchschlüssel: ");
        int x = scan.nextInt();

        // Durchführung der binären Suche mit Zwischenschritten
        int ergebnis = binaerSucheSteps(A, x);

        // Ausgabe des Ergebnisses
        if (ergebnis == -1) {
            System.out.println("Suchschlüssel " + x + " nicht gefunden.");
        } else {
            System.out.println("Suchschlüssel " + x + " gefunden an Position " + ergebnis + ".");
        }

        scan.close();
    }

    // Methode für die binäre Suche mit Zwischenschritten
    public static int binaerSucheSteps(int[] A, int x) {
        int l = 0;
        int r = A.length - 1;

        // Ausgabe der Zwischenschritte
        System.out.println("\nZwischenschritte der binären Suche:");

        while (l <= r) {
            int m = (l + r) / 2;

            // Zwischenschritte anzeigen
            System.out.println("l = " + l + ", r = " + r + ", m = " + m + ", A[m] = " + A[m]);

            // Überprüfen, ob der Suchschlüssel gefunden wurde
            if (A[m] == x) {
                return m;
            }

            // Wenn x kleiner ist, suche in der linken Hälfte
            if (A[m] > x) {
                r = m - 1;
            } else {
                // Andernfalls suche in der rechten Hälfte
                l = m + 1;
            }
        }

        // Wenn der Suchschlüssel nicht gefunden wurde
        return -1;
    }
} Hi from replit