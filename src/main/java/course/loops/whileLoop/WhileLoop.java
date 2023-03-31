package course.loops.whileLoop;

public class WhileLoop {

    public static void main(String[] args) {
        int j = 0;
        while (j < 10) {
            if ((j % 2) == 0) {
                System.out.println(j + " ist eine gerade Zahl");
            } else {
                System.out.println(j + " ist eine ungerade Zahl");
            }
            j++;
        }
    }

}
