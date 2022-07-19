package LinkedList;

import java.util.*;

public class LLPalindrome {
    static private Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void insertNode(int data) {
        Node newnode = new Node(data); // null 10
        if (head == null) { // null = null
            head = newnode; // null = 10 ; head =10 ; 10.next = null 10 -> 20 - > null
            newnode.next = null;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = null;
    }

    public static boolean Palindrome() {

        Stack<Integer> s = new Stack<>();
        Node temp = head;
        boolean is = true;
        while (temp.next != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        s.add(temp.data);
        System.out.println(s);

        while (temp != null && !s.isEmpty()) {
            // System.out.println(s.pop() + "=" + temp.data);
            int i = s.pop();
            // int j = temp.data;
            // System.out.println();
            if (temp.data != i) {
                is = false;
            } else {
                is = true;
                break;
            }
            temp = temp.next;

        }
        return is;

    }

    public static void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertNode(10);
        insertNode(20);
        insertNode(20);
        insertNode(10);
        // insertNode(50);
        Display();
        System.out.println(Palindrome());

    }
}