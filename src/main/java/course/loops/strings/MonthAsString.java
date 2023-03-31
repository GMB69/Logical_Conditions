package course.loops.strings;

public class MonthAsString {
    public static String monthAsString (String str){
        String [] monat = str.split("\\.");         // Array monat übernimmt die einzelnen Werte von Datum aus der Main Methode
        int monatszahl = Integer.parseInt(monat[1]);      // monatszahl wird als Integer aus dem 2. Teil des String monat ermittelt (geparsed)
        String[] namen = {"Jänner","Februar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
        return namen[monatszahl - 1];                     // Als Ergebnis erhält man den Monatsnamen (monatszahl-1)-tes Element des Arrays namen
    }
    public static void main(String[] args) {
        String datum = monthAsString("24.05.1969");       // datum wird ermittelt aus dem String "24.05.1969" durch die Methode monthAsString
        System.out.println("Der Monat ist " + datum);
    }
}
