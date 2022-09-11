package Striver.Array;

import java.util.Arrays;

public class DuplicateArrayEleSorted {
    public static void main(String[] args) {
        int  pos = 0;
        int a[] = { 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4 };
        for (int i = 1; i < a.length; i++) {
            if (a[pos] != a[i]) {
                pos++;
                a[pos] = a[i];
            }
        }
        a[pos++] = a[a.length - 1];
        for (int i = 0; i < pos; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}
