package Strings;

public class LastWordLength {
    public static void main(String[] args) {
        String str = "     Hello wordlss        ";
        boolean found = false;
        String s = str.trim();
        // System.out.println(s);
        int count = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ' && found) {
                break;
            }
            if (ch != ' ') {
                count++;
                found = true;

            }
        }
        System.out.println(count);
    }
}
