package LoveBabbar;

import java.util.Arrays;

public class ReArrangeNegativeNumber {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 1, 1, -100000, -1, -1, -1, -12344, -1 };
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
