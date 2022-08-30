package Strings;

public class CodedWord {
    public static String Codegenerator(String s) {
        for (int i = 1; i < s.length() - 1; i++) {
            s = s.replace(s.charAt(i), '*');
        }
        return s;

    }

    public static void main(String[] args) {
        String str = "gaurav";
        System.out.println("Coded: " + Codegenerator(str));
    }

}