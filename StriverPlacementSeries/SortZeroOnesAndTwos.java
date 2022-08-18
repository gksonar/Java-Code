package StriverPlacementSeries;

import java.util.Arrays;

public class SortZeroOnesAndTwos {
    static int[] sort012Brute(int a[]) {
        Arrays.sort(a); // O(nlogn) space : O(1)
        return a;
    }

    static int[] sort012Better(int a[]) { // O(n)+O(n)= O(2n)
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                count0++;
            if (a[i] == 1)
                count1++;
            if (a[i] == 2)
                count2++;
        }
        System.out.println(count2);
        for (int i = 0; i < count0 - 1; i++) {
            a[i] = 0;
        }
        for (int i = count0; i < (count0 + count1 - 1); i++) {
            a[i] = 1;
        }
        for (int i = (count0 + count1); i < a.length; i++) {
            a[i] = 2;
        }
        return a;
    }

    static int[] sort012Optimal(int a[]) { // Dutch National Flag Algorithm
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            if (a[mid] == 1) {
                mid++;
            }
            if (a[mid] == 2) {
                int temp = a[high];
                a[high] = a[low];
                a[low] = temp;
                high--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = { 2, 0, 2, 1, 1, 0 };
        // System.out.println(Arrays.toString(sort012Brute(a)));
        System.out.println(Arrays.toString(sort012Better(a)));
        // System.out.println(Arrays.toString(sort012Optimal(a)));

    }
}
