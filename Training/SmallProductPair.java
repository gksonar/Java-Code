package Training;

import java.util.*;

public class SmallProductPair {

    public static int productSmall(int a[]) {
        Arrays.sort(a);

        return ((a[0] * a[1]) < 9) ? (a[0] * a[1]) : -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 3, 9, 7, 1 };
        int y = productSmall(arr);
        System.out.println(y);

    }
}
