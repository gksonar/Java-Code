package Striver.Array;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b[] ={1,2,3,4,5,6};
        int k =0;
        
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            hs.add(b[i]);
        }
        int c[] = new int[hs.size()];
        for (int x : hs) {
            c[k++]=x;
        }
        System.out.println(Arrays.toString(c));
    }
}
