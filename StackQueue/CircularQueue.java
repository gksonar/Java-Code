package StackQueue;

public class CircularQueue {

    public static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            arr = new int[size];
            Queue.size = size;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Full Queue");
                return;
            }
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int res = arr[front];

            if (front == rear)
                front = rear = -1;
            else
                front = (front + 1) % size;
            return res;

        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];

        }

        public void display() {
            System.out.println(front);
            System.out.println(rear);
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(arr[i] + " ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Queue s = new Queue(5);

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.display();
        if (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }

    }
}
