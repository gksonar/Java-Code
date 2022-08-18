package StackQueue;

public class StackArray {
    public static class Stack {
        static final int max = 10;
        static int top;
        static int arr[] = new int[max];

        public boolean isEmpty() {
            if (top < 0) {
                top = -1;
                return true;
            }
            return false;
        }

        public void push(int data) {
            if (top == max - 1) {
                System.out.println("Overflow !!");
                return;
            } else {
                top++;
                arr[top] = data;
                return;
            }
        }

        public int pop() {
            if (top == -1) {
                return -1;
            } else {
                int ele = arr[top];
                top--;
                return ele;
            }
        }

        public int peek() {
            isEmpty();
            return arr[top];
        }

        public static void display() {
            // System.out.println("Printing stack elements .....");
            for (int i = top; i > 0; i--) {
                System.out.println(arr[i]);
            }
        }

        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println("Top: " + s.peek());
            s.pop();
            display();
            System.out.println("Top: " + s.peek());
            // if (!s.isEmpty()) {
            // System.out.println(s.peek());
            // s.pop();
            // }
            display();

        }
    }
}
