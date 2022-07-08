package InterviewQuestion;

import java.util.Arrays;

//import java.util.ArrayList;

public class DecimalToBinary {
    public static void intToBinary() {
        int dec = 5;
        int a[] = new int[20];
        int i = 0;
        while (dec > 0) {
            a[i++] = dec % 2;
            dec = dec / 2;

        }
        // ArrayList<Integer> a = new ArrayList<>();
        // while (dec > 0) {
        // a.add(dec % 2);
        // dec = dec / 2;
        // }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(a[j]);

        }
    }

    public static void binarytoInt() {
        int b = 1010;
        int n = 0;
        int dec = 0;
        if (b == 0) {
            return;
        } else {
            while (b > 0) {
                int temp = b % 10;
                dec = dec + (int) (temp * Math.pow(2, n));
                b = b / 10;
                n++;
            }
        }
        System.out.println(dec);

    }

    public static void main(String[] args) {
        binarytoInt();
        int a = 121;
        String ab = String.valueOf(a);
        int dec = Integer.parseInt(ab, 8);
        System.out.println(dec);
        ab = String.valueOf(dec);
        System.out.println(Integer.parseInt(ab, 10));
    }
}
