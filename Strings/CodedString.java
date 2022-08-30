package Strings;

public class CodedString {
    public static void main(String[] args) {
        String g = "Niraj";
        String s = "Tejas";
        String ans = "T"; // Nijas
        String rev = "";
        // int a = 'G' - 'A';
        // int b = 'S' - 'A';
        for (int i = 0; i < ans.length(); i++) {
            for (int j = 0; j < g.length(); j++) {
                if (ans.charAt(i) == g.charAt(j) && ans.charAt(i) == s.charAt(i)) {
                    rev += s.charAt(j);
                    continue;
                }
                if (ans.charAt(i) == g.charAt(j)) {
                    rev += s.charAt(j);
                }
                if (ans.charAt(i) == s.charAt(j)) {
                    rev += g.charAt(j);
                }

            }
        }
        System.out.println(rev);

    }
}
