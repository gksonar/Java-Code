package StackQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Hello");
        q.add("Hi");
        q.add("Bye");
        System.out.println(q);
    }

}
