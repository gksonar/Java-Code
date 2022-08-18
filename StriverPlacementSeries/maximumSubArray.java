package StriverPlacementSeries;

public class maximumSubArray {
    public static int bruteforce(int a[]) {
        int max = a[0];
        int curr = 0;
        for (int i = 0; i < a.length; i++) {
            curr += a[i];
            if (curr > max)
                max = curr;
            if (curr < 0)
                curr = 0;

        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(bruteforce(a));
    }

}
