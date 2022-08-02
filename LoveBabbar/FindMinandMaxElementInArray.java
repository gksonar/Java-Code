package LoveBabbar;

public class FindMinandMaxElementInArray {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 4, 60, 5 };
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        System.out.println(min + " " + max);
    }
}
