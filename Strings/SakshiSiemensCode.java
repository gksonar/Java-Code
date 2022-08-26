package Strings;

public class SakshiSiemensCode {
    public static void main(String[] args) {
        String s1 = "Sakshi";
        String s2 = "Walzade";
        // swalzade
        char temp = s1.charAt(0);
        String ans = temp + s2;
        System.out.println(temp + s2);

        // deswalza
        int strlen = ans.length();
        ans = ans.substring(strlen - 2, strlen) + ans.substring(0, strlen - 2);
        System.out.println(ans);

        // deswilze
        int firsta = ans.indexOf('a');
        int lasta = ans.lastIndexOf('a');
        ans = ans.substring(0, firsta) + 'i' + ans.substring(firsta + 1, ans.length());
        ans = ans.substring(0, lasta) + 'e' + ans.substring(lasta + 1, ans.length());
        System.out.println(ans);

    }
}
