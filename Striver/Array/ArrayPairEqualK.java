package Striver.Array;

public class ArrayPairEqualK {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 1 };
        int K = 2;
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            
                if (a[i] + a[i+1] == K) {
                    count++;
                }
            
        }
        System.out.println(count);
    }}
