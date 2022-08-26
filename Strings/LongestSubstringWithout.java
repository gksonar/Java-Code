package Strings;

import java.util.HashSet;
import java.util.*;

public class LongestSubstringWithout {
    public static int LSWC(String s) {
        System.out.println(s);
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set);
        if (set.size() == s.length()) {
            return s.length();
        } else
            return 0;
    }

    public static int Solve(String s) {
        int max = 0, op = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                op = LSWC(s.substring(i, j));
                max = Math.max(max, op);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String a = "bbbbb";
        int ans = Solve(a);
        System.out.println(ans);
    }
}