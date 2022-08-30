package InterviewQuestion;

import java.util.HashMap;

public class RansomrNoteMagazine {
    public static void main(String[] args) {
        String r = "aa";
        String m = "aab";

        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < m.length(); i++) {
            char mg = m.charAt(i);
            int currentC = hs.getOrDefault(mg, 0);
            hs.put(mg, currentC + 1);
            // System.out.println(hs);
        }

        for (int i = 0; i < r.length(); i++) {
            char mg = r.charAt(i);
            int currentC = hs.getOrDefault(mg, 0);
            hs.put(mg, currentC - 1);
            if (currentC == 0)
                System.out.println("False");
            System.out.println(hs);
        }
        System.out.println("true");


        
    }

}
