package Training;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 1 };
        int mid = a.length / 2;
        int sum1 = 0, sum2 = 0;
        if (a.length == 0)
            return;
        for (int i = 0; i < mid; i++) {
            sum1 += a[i];
        }
        for (int i = mid + 1; i < a.length; i++) {
            sum2 += a[i];
        }
        System.out.println((sum1 == sum2) ? "Equilibrium" : "Not");
    }

}
