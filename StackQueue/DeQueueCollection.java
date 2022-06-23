package StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueCollection {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);

        dq.addFirst(5);
        dq.addLast(55);

        dq.offer(15);

        dq.offerLast(22);

        dq.push(18);
        Deque<Integer> dqll = dq.clone();
        System.out.println(dq.peek());

        System.out.println(dq);

        System.out.println(dqll);

    }
}
