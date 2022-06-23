package StackQueue;

import java.util.*;

public class QueueCollections {

    public static void main(String[] args) {
        Queue<Integer> s = new LinkedList<>();

        s.add(10);
        s.add(20);
        s.add(30);
        if (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }

        System.out.println(s);
    }

}
