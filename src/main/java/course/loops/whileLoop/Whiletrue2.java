package course.loops.whileLoop;

public class Whiletrue2 {
    public static void func(int n) {
        int m = n + 1;
        while (true) {
            if ((m % n) == 0) {
                m++;
                continue;
            }
            m++;
            System.out.println("m = " + m);
        }
    }

    public static void main(String[] args) {
      func(5);
    //    System.out.println(func(5));
    }

}