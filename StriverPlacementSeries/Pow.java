package StriverPlacementSeries;

public class Pow {
    public static void main(String[] args) {
        double a = 10.00000;
        int r = -2;
        double sum = a;
        for (int i = 1; i < r; i++) {
            if (a > 0)
                sum *= a;
            else if (a < 0) {
                sum *= a;
                sum = 1 / sum;
            }
        }
        System.out.println(sum);
    }
}
