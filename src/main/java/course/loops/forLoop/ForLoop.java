package course.loops.forLoop;

public class ForLoop {

    public static int summe(int f) {
        int result = 0;
        for (int i = 0; i <= f; i++) {
            result = result + i;
        }
        return result;
    }

    public static int fakultaet(int n) {
        int ergebnis = 1;
        for (int zahl = 1; zahl <= n; zahl++) {
            ergebnis = ergebnis * zahl;
        }
        return ergebnis;
    }
    // Fibonaccizahl nicht rekursiv
    public static int fibonacci(int a){
        int fib = 1;
        for (int fib1 = 1, fib2 = 1, i=3; i <= a; i++){
            fib =  fib1 + fib2; // fib ist  Summe der beiden Zahlen fib1 und fib2 (zunächst 1+1)
            fib1 = fib2; // fib1 (neu) wird fib2 (alt) gleich gesetzt
            fib2 = fib; // fib2 (neu) wird der ermittelten Zahl fib gleich gesetzt
        }
        return fib; // fib wird ausgegeben; neuer Durchlauf mit neuen Zahlen;
    }

    // Fibonaccizahl rekursiv
    public static int fibo(int s) {
        int fibzahl = 0;
        for (int g = 0; g <= s; g++) {
            if (s == 1 || s == 2) {
                fibzahl = 1;
                continue;
            }
            fibzahl = fibo(s-1) + fibo(s-2);

        }
        return fibzahl;
    }
        public static void main (String[] args) {
            int limit = 12;
            System.out.println("Die Summe der natürlichen Zahlen von 1 bis " + limit + " ist " + summe(limit));
            System.out.println("Die Fakultät der natürlichen Zahlen von 1 bis " + limit + " ist " + fakultaet(limit));
            System.out.println("Die " + limit + ". Zahl der nicht rekursiv berechneten Fibonacci Reihe ist " + fibonacci(limit));
            System.out.println("Die " + limit + ". Zahl der rekursiv berechneten Fibonacci Reihe ist " + fibo(limit));

        }
    }
