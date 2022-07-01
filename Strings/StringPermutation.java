package Strings;

import java.util.Arrays;

public class StringPermutation {

    static boolean arePermutation(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s1.length();
        if (l1 != l2)
            return false;
        char f[] = s1.toCharArray();
        char s[] = s2.toCharArray();

        Arrays.sort(f);
        Arrays.sort(s);

        for (int k = 0; k < l1; k++) {
            if (f[k] != s[k]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "admma";
        if (arePermutation(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
