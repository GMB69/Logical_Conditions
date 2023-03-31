package course.loops.whileLoop;

public class Array {
    public static double array_summe(double[] arr) {
        int i = 0;
        double summe = 0;
        while (i < arr.length) {
            summe += arr[i];
            i++;
        }
        return summe;
    }

    public static void main(String[] args) {
        double [] n = {4, 4};
        double[] array = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        double[] array2 = {1.21, 2.22, 3.32, 4.42, 5.52, 6.62};
        System.out.println("Die Summe des Arrays {1.1, 2.2, 3.3, 4.4, 5.5, 6.6} ist " + array_summe(array));
        System.out.println("Die Summe des Arrays {1.1, 2.2, 3.3, 4.4, 5.5, 6.6} ist " + array_summe(array2));
        System.out.println("Die Summe des Arrays {4, 4} ist " + array_summe(n));
    }
}