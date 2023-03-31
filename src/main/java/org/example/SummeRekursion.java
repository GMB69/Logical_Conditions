package org.example;
// Summe rekursiv
public class SummeRekursion {
    public static int summeRekursion (int n) {
        if (n<=0) {
            return 0;
        } else {
            return n + summeRekursion(n-1);
        }
    }
    public static void main(String[] args) {
    System.out.println("Die Summe ergibt " + summeRekursion(5 ));}
}
