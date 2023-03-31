package course.loops.whileLoop;

public class Whiletrue {

    public static void main (String [] args) {
        int n = 5;
        int m = n + 1;
        while (true) {
            if ((m % n) == 0) {
                m ++;
                continue;
            }
            m ++;
            System.out.println("m = " + m);
        }
    }
}


