package Strings;

import java.util.HashMap;
// g - s
// a - n
// u - e 
// r - h
// a - a
// v - l
//int a [] = {7,5,4,6,7};
// 
//uvraga
//elhnsn
public class CodedWord {
    public static String Codegenerator(String s, String t, String ip) {
        HashMap<Character, Character> hs = new HashMap<>();
        if (s.length() != t.length()) {
            return "";
        }

        for ( int i = 0; i < s.length(); i++) {
            hs.put(s.charAt(i),t.charAt(i));
        }
        System.out.println(hs);
        return s;
    }

    public static void main(String[] args) {
        String str = "gaurav";
        String str1 = "snehal";
        String ip = "uvraga";
        System.out.println("Coded: "+Codegenerator(str,str1,ip));
    //     if (str1.length() != str.length()) {
    //         System.out.println("Not same Lenght");
    //     }
    //     char c1[] = str1.toCharArray();
    //     char c2[] = str.toCharArray();
    //     char ipc[] = ip.toCharArray();
    //     String res ="";
    //     char ans=' ';
    //     for (int i = 0; i < ip.length(); i++) {
    //         for (int index = 0; index < c1.length; index++) {
    //         if (ipc[i] == c1[index]) {
    //             ans = c2[index];
    //         }
    //         else if (ipc[i] == c2[i]) {
    //             ans = c1[index];
    //         }
    //     }
    //     res = res+ ans;
    //     }
    //     System.out.println(res);
    // }
}

}