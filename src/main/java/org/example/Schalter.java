package org.example;

public class Schalter {
    public static void main(String[] args) {
        int a = 7;
        if (a == 0) {
            System.out.println("a ist gleich 0");
        } else if (a == 2) {
            System.out.println("a ist gleich 2");
        } else if (a == 3) {
            System.out.println("a ist gleich 3");
        } else if (a == 7) {
            System.out.println("a ist gleich 7");
        } else {
            System.out.println("Der Wert von a ist unerwartet");
        }
        switch (a) {
            case 0:
                System.out.println("a ist gleich 0");
                break;
            case 2:
                System.out.println("a ist gleich 2");
                break;
            case 3:
                System.out.println("a ist gleich 3");
                break;
            case 7:
                System.out.println("a ist gleich 7");
                break;
            default:
                System.out.println("Der Wert von a ist unerwartet");

        }
    }

}
