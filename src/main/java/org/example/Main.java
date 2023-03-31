package org.example;

public class Main {


    public static void main(String[] args) {
        int a = 34;
        switch (a) {
            case 42:
                break;
            case 52:
            case 11:
                System.out.println("Programmieren macht richtig Spass!");
                break;
            case 34:
                System.out.println("Hello World");
                break;
            default:
                System.out.println("Funny");
        }

    }
}
