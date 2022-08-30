package Striver;

public class ReverseNumber {
    public static int reverseFun(int no) {
        int sum =0 , rem =0;
        while (no>0) {
            rem = no %10;   
            sum = sum * 10 + rem;
            no = no/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = 123;
        System.out.println(reverseFun(a));
    }

}