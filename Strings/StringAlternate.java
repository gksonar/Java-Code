package Strings;

public class StringAlternate {
    public static void main(String[] args) {
        String Str = "Gaurav Sonar";

        String ans = "";
        int pos = 0;
        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) == ' ') {
                pos = i;
            }
        }
        Str = Str.substring(0, pos) + Str.substring(pos + 1, Str.length());
        char a[] = Str.toCharArray();
        for (int i = 0; i < a.length - 1; i += 2) {
            ans = ans + a[i + 1] + a[i];
        }
        ans = ans + a[a.length - 1];
        // System.out.println(Str);
        ans = ans.substring(0, pos) + " " + ans.substring(pos, Str.length());
        System.out.println(ans);
    }
}
