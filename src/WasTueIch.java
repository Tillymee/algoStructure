import java.util.Scanner;

public class WasTueIch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ganze Zahl: ");
        int n = scanner.nextInt();

        int result = berechne(n);

        System.out.println("Das Ergebnis für n = " + n + " ist: " + result);

        scanner.close();
    }

    public static int berechne(int n) {
        int i = 0;
        int k = -1;
        int y = 0;

        //Schleife, solange i < n
        while (i < n) {
            i = i + 1;
            k = k + 2;
            y = y + k;

            System.out.println("Schritt " + i + ": i = " + i + ", k = " + k + ", y = " + y);

        }
        return y;
    }

}
