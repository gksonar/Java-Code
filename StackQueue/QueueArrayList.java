package StackQueue;

import java.util.*;

public class QueueArrayList {
    static class Queue {
        static ArrayList<Integer> a = new ArrayList<>();
        static int front = -1;
        static int rear = -1;

        public boolean isEmpty() {
            return a.size() == 0;
        }

        public void add(int data) {
            a.add(data);
            rear++;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = a.get(0);
            for (int i = front; i <= rear; i++) {
                a.set(i, i + 1);
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return a.get(0);

        }

        public void display() {
            for (int i = front + 1; i <= rear; i++)
                System.out.print(a.get(i) + " ");

            System.out.println();
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(10);
            q.add(20);
            q.add(30);
            q.display();
            if (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
            q.display();
        }

    }
}
