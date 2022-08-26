package VarasiCodes;

public class CheckPrimeNumber {
    public static boolean isPrime(int  no ) {
        for (int i = 2; i < no/2; i++) {
            if(no%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int no = 35;
        System.out.println(isPrime(no));
    }
}
