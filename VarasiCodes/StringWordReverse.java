package VarasiCodes;

public class StringWordReverse {

    public static String StringWordReverse1(String s) {
        String res = "";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                String rev = reverseWord(ans);
                res = res + " " + rev;
                ans = "";
            } else {
                ans += s.charAt(i);
            }
        }
        String rev = reverseWord(ans);
        res = res + " " + rev;
        res=res.trim();
        return res;
    }

    public static String reverseWord(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String res = new String(sb);
        return res;
    }

    public static void main(String[] args) {
        String str = "Today is Saturday";
        System.out.println(StringWordReverse1(str));
    }
}
