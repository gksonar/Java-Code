package Striver;

public class CountDigits {
    public static int countDigits(int no) {
        int count = 0, rem = 0;
        while (no != 0) {
            rem = no % 10;
            count++;
            no = no / 10;
            System.out.println(rem);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int no = 12345;
        System.out.println("Count:  "+countDigits(no));
    }

}
