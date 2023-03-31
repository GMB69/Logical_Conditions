package course.loops.strings;

public class PalimPalim {
    public static void main(String[] args) {
        String satz = ("Der vor dir stehende Rentner heißt Otto Uwe");
        palindrom(satz);
    }

    public static void palindrom(String text) {
        String[] worte = text.split(" ");
        for (String w : worte) {
            String w1 = w.toLowerCase();
          /*  String revertedw1 = new StringBuilder(w1).reverse().toString();
            if (w1.equals(revertedw1)) {
                System.out.println(w + " ist ein PALINDROM!");
            } */
            int i, j = w1.length() - 1;
            boolean currentword = true;
            for (i = 0; i < j; i++, j--) {
                if (w1.charAt(i) != w1.charAt(j)) {
                    currentword = false;
                    break;
                }
            }
            if (currentword) System.out.println(w + " ist ein PALINDROM!");
        }
    }
}
