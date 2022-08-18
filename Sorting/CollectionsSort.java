package Sorting;

public class CollectionsSort {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static void isCeaserCipher(String str, int k) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            int pos = alpha.indexOf(str.charAt(i));
            int keyval = (pos - k) % 26;
            if (keyval < 0) {
                keyval = alpha.length() + keyval;
            }
            res += alpha.charAt(keyval);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        String str = "Gaurav";
        int k = 3;
        isCeaserCipher(str, k);

    }
}
