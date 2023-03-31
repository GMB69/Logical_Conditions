package course.loops.strings;

public class Anagramm {
    public static void main(String[] args) {
        String a1 = "Desperation";
        String b1 = "A Rope ends it";
        String a = a1.replaceAll(" ","").toLowerCase();   // Eliminieren aller Leerzeichen und Umwandeln des Strings in Kleinbuchstaben
        String b = b1.replaceAll(" ","").toLowerCase();
        if (isAnagram(a,b)){
            System.out.println("'"+a1+ "' und '"+b1+"' sind Anagramme!");   // if (isAnagram(a,b)) ergibt direkt true oder false
        }else{
            System.out.println("'"+a1+ "' und '"+b1+"' sind keine Anagramme.");
        }
    }
    public static boolean isAnagram(String a, String b) {

        int[] alphabet = new int[26];               // alphabet wird als array mit 26 Zeichen angelegt (Der Code zählt die Anzahl der Zeichen, indem er die Tatsache ausnutzt, dass ein char in eine ganze Zahl umgewandelt und in einem Array int[] alpha = new int[26]; verwendet werden kann, das 26 Zeichen lang ist, um den Buchstaben des Alphabets zu entsprechen, und dafür nur minimalen Code benötigt.
        for (int i = 0; i < a.length(); i++) {      // Schleife von 0 bis Länge String a
            alphabet[a.charAt(i) - 'a']++;          // erhöht den Wert des x-ten Zeichens (=Buchstabens) im array alphabet um 1 (zählt also z.b. die Anzahl aller r's), indem es den numerischen Wert des Buchstabens von String a an der i-ten Stelle um den numerische Wert von "a" (=97) reduziert (-'a')
        }                                           //
        for (int i = 0; i < b.length(); i++) {      // Schleife von 0 bis Länge String a
            alphabet[b.charAt(i) - 'a']--;          // analog zu oben, nur wird hier der Wert des x-ten Zeichens (=Buchstabens) im array alphabet um 1 reduziert
        }

        for (int w : alphabet) {                    // for-each Schleife: für jedes Element w im Array alphabet
            if (w != 0) {                           // wenn w ungleich null ist, dann kommt dieses Zeichen des arrays alphabet (=dieser Buchstabe) in einem der beiden Strings öfter vor als im anderen
                return false;                       // in diesem Fall ist der boolsche Wert FALSCH
            }
        }
        return true;                                // sind alle w's 0, dann ist der boolsche Wert TRUE

    }
}