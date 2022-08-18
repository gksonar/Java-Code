
package Training;

import java.util.Arrays;

public class DIFF {
    public static int productSmall(int a[]) {
        Arrays.sort(a);

        return ((a[0] * a[1]) < 9) ? (a[0] * a[1]) : -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 3, 9, 7, 1 };
        int y = productSmall(arr);
        System.out.println(y);
        int[] a = { 12, 3, 14, 56, 77, 13 };
        int no = 13;
        int count = 0;
        int diff = 2;
        for (int i = 0; i < a.length; i++) {
            int res = Math.abs((no - a[i]));
            if (res <= diff) {
                count++;
            }
        }
        System.out.println((count == 0) ? "-1" : count);
    }
}
