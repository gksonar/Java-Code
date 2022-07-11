package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {
    public static void main(String[] args) {
        String s = "Hello my name is Gaurav";
        PrintDuplicate(s);
    }

    static void PrintDuplicate(String s) {
        Set<Character> set = new LinkedHashSet<Character>();
        for (char c : s.toCharArray()) {
            set.add(Character.valueOf(c));
        }
        set.remove(' ');
        System.out.println(set);
    }
}
