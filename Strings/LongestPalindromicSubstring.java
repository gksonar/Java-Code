package Strings;

import java.util.*;

public class LongestPalindromicSubstring {
    static public String solve(String s) {
        String rev = "";
        String os = s;
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        // System.out.println(rev);
        // System.out.println(os);
        if (os.equals(rev)) {
            return os;
        }
        return null;
    }

    static public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        ArrayList<String> a = new ArrayList<>();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                s1 = "";
                // s1 = solve(s.substring(i, j + 1));
                s1 = solve(s.substring(i, j + 1));
                if (s1 != null) {
                    a.add(s1);
                }
            }
        }
        Collections.sort(a, Comparator.comparingInt(String::length));
        s1 = a.get(a.size() - 1);
        System.out.println(a);
        return s1;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome(
                "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }

}