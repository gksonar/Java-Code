package StackQueue;

public class QueueArray {
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
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            front = arr[0];

            for (int i = 0; i <= rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[0];

        }

        public void display() {
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
        s.display();
        if (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }

    }
}
