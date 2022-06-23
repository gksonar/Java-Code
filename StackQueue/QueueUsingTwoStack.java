package StackQueue;

import java.util.Stack;

public class QueueUsingTwoStack {
    public static class QueueUsingStack {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (!s1.empty())
                s2.push(s1.pop());
            s1.push(data);
            while (!s2.empty())
                s1.push(s2.pop());
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            return s1.peek();
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            return s1.pop();
        }

        public static void main(String[] args) {
            QueueUsingStack q = new QueueUsingStack();
            q.add(10);
            q.add(20);
            q.add(30);
            q.add(25);
            q.add(15);
            // System.out.print(q.remove());
            // System.out.print(q);
            while (!QueueUsingStack.isEmpty()) {
                System.out.println(q.peek());
            }
        }
    }
}
