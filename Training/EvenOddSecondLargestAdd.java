package Training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenOddSecondLargestAdd {
    static int funca(int a[], int n) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even.add(a[i]);
            else
                odd.add(a[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        // sou
        return even.get(even.size() - 2) + odd.get(odd.size() - 2);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 7, 5, 4 };
        int n = arr.length;
        System.out.println(funca(arr, n));
    }
}
