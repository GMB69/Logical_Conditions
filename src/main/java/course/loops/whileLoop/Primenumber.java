package course.loops.whileLoop;

public class Primenumber {
    public static void primeNumbers(int n) { // void bedeutet, dass kein Ergebniswert (return) erwartet wird
        int i = 1;
        int j;
        boolean Primenumber = true;         // boolscher Anfangswert WAHR
        while (i < n) {                     // Schleife von i = 1 bis 1.000
            for (j = 2; j < i - 1; j++) {   // Schleife: von j=2 bis i-1;
                if (i % j == 0) {           // wenn i durch j geteilt werden kann
                    Primenumber = false;    // dann ist i keine Primzahl
                }
            }
            if (Primenumber) {              // wenn i eine Primzahl ist
                System.out.println(i);      // gib die Zahl aus
            } else Primenumber = true;      // setze die Bool'sche Variable wieder auf WAHR
            i++;                            // und erhöhe i um 1 (und beginne die while-Schleife von vorne
        }
    }

public static void main(String[] args) {
    primeNumbers(1000);                    //Ermittle die Primzahlen bis 1.000
}                                             // Primzahlen sind nur durch 1 und sich selbst teilbar
}
