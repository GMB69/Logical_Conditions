package course.loops.strings;

public class String_Builder {
    public static void generateRandomString() {
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "fiep! ";
        }
        System.out.println(result);
    }
/*    public static void main(String[] args) {
        generateRandomString();
    }
}*/

    public static void appendRandomString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            result.append ("pieps. ");
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        appendRandomString();
        generateRandomString();
    }
}