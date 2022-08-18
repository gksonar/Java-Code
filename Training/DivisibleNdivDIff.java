package Training;

public class DivisibleNdivDIff {
    static int funadd(int n, int m) {
        int div = 0;
        int ndiv = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                div += i;
            } else {
                ndiv += i;
            }
        }
        return Math.abs(div - ndiv);
    }

    public static void main(String[] args) {

        System.out.println(funadd(4, 20));
    }
}
