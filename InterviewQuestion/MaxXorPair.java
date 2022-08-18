package InterviewQuestion;

public class MaxXorPair {

    public static void main(String[] args) {
        int x = 4, y = 0;
        for (; y < 5; ++y) {
            if (y % x == 0)
                continue;
            else if (y == 7)
                break;
            else
                System.out.println(y);
        }
    }
}
