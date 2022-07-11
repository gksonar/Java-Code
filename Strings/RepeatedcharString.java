package Strings;

import java.util.ArrayList;

public class RepeatedcharString {
    public static void main(String[] args) {
        String str = "AAbcdeg";
        char ch[] = new char[str.length()];
        ch = str.toCharArray();
        ArrayList<Character> a = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    a.add(ch[j]);
                }
            }
        }
        System.out.println(a);
    }
}
