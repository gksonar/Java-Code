package Striver;

public class ArmStrongNumbers {
    public static boolean isArmStrong(int no) {
        int rem = 0, sum = 0, org = no;
        while (no > 0) {
            rem = no % 10;
            sum = sum + (int) Math.pow(rem, 3);
            no = no / 10;
        }
        return (org == sum) ? true : false;
    }

    public static void main(String[] args) {
        int a = 371;
        System.out.println(isArmStrong(a));
    }
}
