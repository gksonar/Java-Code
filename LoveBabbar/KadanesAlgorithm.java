package LoveBabbar;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int a[] = { 1,2,3,4,5,6,7,8 };
        int min = a[0];
        int curr = a[0];
        for (int i = 1; i < a.length; i++) {
            curr = Math.min(a[i], curr + a[i]);
            min = Math.min(min, curr);
        }
        System.out.println(min);
    }
}