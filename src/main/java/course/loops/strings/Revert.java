package course.loops.strings;

public class Revert {
    public static String revert(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        revert("Qcademy");
        System.out.println("Qcademy => " +revert("Qcademy"));
    }
}
