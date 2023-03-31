package org.example;

public class Fibonacci {

    public static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
     public static void main(String[] args) {
     int a = 9;
     System.out.println("Die "+a+". Zahl der Fibonacci Reihe ist "+fib(a));
  }
}