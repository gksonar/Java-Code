package LoveBabbar;

import java.util.Arrays;

public class SortZeroOneandTwo {
    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0 };
        int low = 0;
        int high = a.length - 1;
        int mid = 0;
        while (mid <= high) {

            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;

            } else if (a[mid] == 2) {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;

                high--;
            }

        }
        System.out.println(Arrays.toString(a));

    }
}
