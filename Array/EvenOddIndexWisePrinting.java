package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddIndexWisePrinting {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 12, 1, 5, 8, 2, 4 };
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        System.out.println(even);
        System.out.println(odd);

        int i = 0, j = 0, k = 0;
        while (i < even.size() && j < odd.size()) {
            arr[k++] = even.get(i++);
            arr[k++] = odd.get(j++);
            // i++;/
        }

        // Store remaining elements of first array
        while (i < even.size())
            arr[k++] = even.get(i++);

        // Store remaining elements of second array
        while (j < odd.size())
            arr[k++] = odd.get(i++);
        System.out.println(Arrays.toString(arr));
    }
}
