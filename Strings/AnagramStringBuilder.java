package Strings;

import java.util.Arrays;

public class AnagramStringBuilder {
    public static boolean isAnagram(String s, String s1) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        char[] b = s1.toCharArray();
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String str = "Gaurav";
        String str1 = "Gaurav";
        System.out.println(isAnagram(str, str1));
    }
}
