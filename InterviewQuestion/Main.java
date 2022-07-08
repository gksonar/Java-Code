package InterviewQuestion;

import java.util.*;

public class Main {
    static public void main(String[] args) {
        int[] b = { 10, 20, 20, 30, 1000, 456, 1, 0 };
        Deque<Integer> a = new ArrayDeque<>();
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            a.add(b[i]);
        }
        System.out.println(a.getFirst() + " " + a.getLast());
    }
}