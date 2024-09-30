package Lerneinheit2;

public class LineareSucheUebung {
    public static void main(String[] args) {

        // Array von Schlüsseln
        String[] A = {"Paul", "Al Sabaah", "Roswiwie", "Fels", "Awad"};

        // Suchschlüssel
        String[] suchSchluessel = {"Awad", "Roswiwie", "Paul", "Schonert"};

        // Suche für jeden Suchschlüssel ausführen
        for (String x : suchSchluessel) { // for-each-Schleife, die über jedes Element im Array suchSchluessel iteriert, für jeden wird Variable x gesetzt
            int result = lineareSuche(A, x); // für jeden SS x wird die Methode lineareSuche aufgerufen
            if (result != -1) {
                System.out.println(x + " gefunden an Position: " + result);
            } else {
                System.out.println(x + " nicht gefunden");
            }
        }
    }
    // Methode für lineare Suche
    public static int lineareSuche(String[] A, String x) {
        int zugriffe = 0; // zählt Anzahl der Arrayzugriffe
        for (int i = 0; i < A.length; i++) { // for-Schleife beginnt, iteriert über das gesamte Array A, i = Index von 0 bis A.length
            zugriffe++; // Arrayzugriff, bei jedem Schleifendurchlauf um 1 erhöht
            if (A[i].equals(x)) { // Wenn der Suchschlüssel gefunden wird
                System.out.println("Arrayzugriffe: " + zugriffe);
                return i;
            }
        }
        System.out.println("Arrayzugriffe: " + zugriffe);
        return -1; // Wenn der Schlüssel nicht gefunden wurde
    }
}
