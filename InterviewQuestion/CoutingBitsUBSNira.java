package InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class CoutingBitsUBSNira {
    public static List<Integer> countingBits(int no) {
        int count = 0;
        List<Integer> l = new ArrayList<>();
        String str = Integer.toBinaryString(no);
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                l.add(i + 1);
                count++;
            }
        }
        l.add(0, count);
        return l;
    }

    public static void main(String[] args) {
        int no = 161;
        System.out.println(countingBits(no));
    }
}
