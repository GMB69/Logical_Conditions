package course.loops.strings;

public class Palindrome {
    public static void main(String[] args) {
        String satz = ("Der vor dir stehende Rentner heißt Otto Uwe");
        palindrom(satz);
    }

    public static void palindrom(String satz) {
        String[] worte = satz.split(" ");
        for (String wort : worte) {
            String wortklein = wort.toLowerCase();
                if (istPalindrom(wortklein)) {
                    System.out.println(wort + " ist ein PALINDROM!");
                } /* else {
                    //System.out.println(wort + " ist KEIN Palindrom!");
                } */
            }
        }

    public static boolean istPalindrom(String wort) {
        int i = 0, j = wort.length() - 1;
        while (i < j) {
            if (wort.charAt(i) != wort.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}