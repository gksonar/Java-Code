package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergeArraysAndRemoveDuplicates {
    public static void MergeArraysAndRemoveDuplicate(int[] a, int[] b) {
        int merged[] = new int[a.length + b.length];
        int k = 0, i = 0;
        while (i < a.length) {
            merged[k] = a[i];
            k++;
            i++;
        }
        while (i < a.length) {
            merged[k] = a[i];
            k++;
            i++;
        }

        Set<Integer> s = new HashSet<>();
        for (int l = 0; l < merged.length; l++) {
            s.add(merged[l]);
        }
        int res[] = new int[s.size()];
        Iterator<Integer> it = s.iterator();
        i = 0;
        while (it.hasNext()) {
            res[i] = it.next();
            i++;
        }
        System.out.println(Arrays.toString(res));
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int[] a = { 10, -3, 5, 6, 2, 1, 4, 5, 6 };
        int[] b = { 5, 6, -3, 5, 4, 5, 6, 7, 8 };
        MergeArraysAndRemoveDuplicate(a, b);
        // System.out.println(Arrays.toString(merged));
    }
}
