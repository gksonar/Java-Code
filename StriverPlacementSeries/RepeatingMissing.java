package StriverPlacementSeries;

import java.util.Arrays;

public class RepeatingMissing {
    public static void freqArray(int a[]) { // O(n)+O(n) = 2n
        int freq[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (freq[a[i] - 1] == 1) {
                System.out.println("repeated: " + a[i]);
            } else {
                freq[a[i] - 1] = 1;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                System.out.println("Missing No: " + (i + 1));
            }
        }
    }

    public static void usingFormulaOptimal(int a[]) {
        int sum = 0;
        int n = a.length;
        int form = (n * (n + 1)) / 2;
        for (int i : a) {
            sum += i;
        }
        System.out.println("Missing: " + (sum - form));
        // System.out.println(form + (form - sum));
    }

    // public static void usingFormulaOptimal1(int a[]) {
    // for (int i = 0; i < a.length - 1; i++) {
    // a[i] = a[i] ^ a[i + 1];
    // }
    // System.out.println(Arrays.toString(a));
    // }

    public static void UsingSorting(int a[]) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 2, 1, 1 };
        // freqArray(a);

        usingFormulaOptimal(a);

        // UsingSorting(a);
    }
}