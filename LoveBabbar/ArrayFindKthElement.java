package LoveBabbar;

import java.util.*;

public class ArrayFindKthElement {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 24 };
        int k = 3;
        Arrays.sort(a);
        System.out.println(a[k - 1]);
    }
}
