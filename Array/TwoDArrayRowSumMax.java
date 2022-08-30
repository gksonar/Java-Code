package Array;

public class TwoDArrayRowSumMax {
    public static void main(String[] args) {

        int a[][] = { { 7, 1, 3 }, { 2, 8, 7 }, { 1, 9, 25 } };
        int sum = 0, max = 0;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = 0; j < a[0].length; j++) {
                sum += a[j][i];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
