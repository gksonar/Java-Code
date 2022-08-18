package Training;

import java.util.Arrays;

public class arraySum {
    public static void main(String[] args) {
        int[] a = { 1, 4, 5, 7, 9 };
        int k = 9;
        int l = 0;
        int r = a.length - 1;
        Arrays.sort(a);
        while (l < r) {
            if ((a[l] + a[r]) == k)
                System.out.println(a[l] + " " + a[r]);
            if ((a[l] + a[r]) > k)
                r = r - 1;
            else if ((a[l] + a[r]) < k)
                l = l + 1;
            else
                return;
        }
    }
}
