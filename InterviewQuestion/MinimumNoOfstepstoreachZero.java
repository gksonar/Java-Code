package InterviewQuestion;

public class MinimumNoOfstepstoreachZero {
    public static void main(String[] args) {
        int no = 8;
        int count = 0;
        while (no != 0) {
            if (no % 2 == 0) {
                no = no / 2;
                count++;
            } else {
                no = no - 1;
                count++;
            }
        }
        System.out.println(count);
    }

}
