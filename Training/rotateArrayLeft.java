package Training;

import java.util.Arrays;

public class rotateArrayLeft {
    public static void main(String[] args) {
        int a[] = { 9, 17, 13, 14 };
        int N = 2;
        System.out.println(Arrays.toString(a));

        while (N < 0) {
            int t = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            // System.out.print(t);
            a[0] = t;
        }
        System.out.println(Arrays.toString(a));
    }
}
