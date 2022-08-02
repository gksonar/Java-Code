package Strings;

public class PanagramOptimised {
    public static void main(String[] args) {
        String str = "abcdefghijklnopqrstuvw";
        boolean arr[] = new boolean[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
            arr[index] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == false)
                flag = 0;
            flag = 1;
        }
        if (flag == 0) {
            System.out.println("False");
        } else
            System.out.println("true");
    }
}
