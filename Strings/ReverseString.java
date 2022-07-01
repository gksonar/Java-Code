package Strings;

public class ReverseString {

    static void Reversestring(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        String str = "Gaurav";
        Reversestring(str);
    }
}