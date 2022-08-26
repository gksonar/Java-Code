package VarasiCodes;

public class CountWords {

    public static int WCount(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ') {
                count++;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "Today is Saturday";
        System.out.println(WCount(str));
    }
}
