package StackQueue;

import java.util.*;

public class StackArrayList {
    static class Stack {
        static ArrayList<Integer> a = new ArrayList<>();

        public boolean isEmpty() {
            return a.size() == 0;
        }

        public void push(int data) {
            a.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = a.get(a.size() - 1);
            a.remove(a.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = a.get(a.size() - 1);
            return top;
        }

        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            if (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
            for (int i = 0; i < a.size(); i++)
                System.out.print(a.get(i) + " ");

        }

    }
}
