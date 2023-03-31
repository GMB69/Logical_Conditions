package course.loops.whileLoop;

public class GGT {
    public static int ggt(int n, int m) {
      int t;
        while ((m % n) != 0) {
          t = m % n;
          m = n;
          n = t;
        }
      return n;
    }
    public static void main(String [] args) {
        System.out.println("Der größte gemeinsame Teiler von 16 und 68 ist " +ggt(16,68));
    }
}
