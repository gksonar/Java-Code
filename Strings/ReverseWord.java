package Strings;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Answer: " + ReverseWords1(str));
        sc.close();
    }

    static String ReverseWords1(String str) {
        if (str == null || str.length() == 0)
            return str;
        String s1 = "", s2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                s1 = " " + s2 + s1;
                s2 = "";
            } else
                s2 += str.charAt(i);
        }
        return s1;
    }

    static String ReverseWords(String str) {
        if (str == null || str.length() == 0)
            return str;
        String s1 = "", s2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                s1 = "." + s2 + s1;
                s2 = "";
            } else
                s2 += str.charAt(i);
        }
        return s1;
    }
}