package LoveBabbar;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max = a[0];
        int curr = a[0];
        for (int i = 1; i < a.length; i++) {
            curr = Math.max(a[i], curr + a[i]);
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }
}