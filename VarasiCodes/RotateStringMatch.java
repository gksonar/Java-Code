package VarasiCodes;

public class RotateStringMatch {
    public static boolean RotateMatch(String s1, String s2) {

        boolean flag = false;
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        if (a.length != b.length)
            return false;

        int pos = 0;
        for (int j = 0; j <= b.length; j++) {
            char temp = a[0];
            for (int i = a.length - 1; i >= 1; i--) {
                a[i - 1] = a[i];
                pos = i;
            }
            a[pos + 1] = temp;
            System.out.print(a[0]+"+"+"-");
            System.out.print(a[1]+"+"+"-");
            System.out.print(a[2]+"+"+"-");
            System.out.print(a[3]+"+"+"-");
            System.out.print(a[4]+"+"+"-");
            // System.out.println(String.valueOf(a) + "================" + match(a, b));
            if (match(a, b)) {
                flag = true;
                break;
            } else {
                flag = false;
            }

        }
        return flag;
    }

    public static boolean match(char[] a, char[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (a[i] == b[i]) {
                count++;
            }
        }
        return (count == a.length) ? true : false;
    }

    public static void main(String[] args) {
        String s1 = "Check";
        String s2 = "ckChe";
        System.out.println(RotateMatch(s1, s2));
    }
}
