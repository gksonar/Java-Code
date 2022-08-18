package LoveBabbar;

import java.util.LinkedHashSet;

public class UnionOfTwoArrays {

    public static int removeDuplicates(int a[], int n, int b[], int m) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
        for (int j = 0; j < b.length; j++)
            set.add(b[j]);
        return set.size();
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int n = a.length;
        int b[] = { 1, 2, 3 };
        int m = b.length;
        System.out.println(removeDuplicates(a, n, b, m));
    }
}
