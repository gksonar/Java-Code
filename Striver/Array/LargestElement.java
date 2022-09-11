package Striver.Array;

public class LargestElement {
    public static int maxElement(int a[]) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max=Math.max(a[i], max);
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {10,20,20,560,1,2,4};
        System.out.println(maxElement(a));
    }
}
