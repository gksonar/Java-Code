package Array;

import java.util.ArrayList;
import java.util.Arrays;

class MinimumNoOfMovesII {
    public static void main(String[] args) {
        int a[] = {1,10,2,9};
        Arrays.sort(a);
        int sum = 0, ans = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < a.length; j++) {
                ans = a[j] - a[i];
                if (ans!=0) {
                    sum++;
                }
            }
            ar.size();
            
        }
        System.out.println(sum);
    }
}