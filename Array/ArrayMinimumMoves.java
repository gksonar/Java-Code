package Array;
import java.util.Arrays;

public class ArrayMinimumMoves {
    public static void main(String[] args) {
        int a[] = { 3, 2, 1 };
        Arrays.sort(a);
        int min = a[0];
        for (int i = 0; i < a.length - 2; ++i) {
            min = Math.min(a[i], a[i + 1]);
        }
        // System.out.println(min);
        int moves = a[0];
        for (int i = 0; i < a.length; i++) {
            moves += a[i] - min;
            // System.out.println(moves);
        }
        System.out.println(moves);
    }
}
