
package LinkedList;

public class ReverseLinkedList {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }

    private Node head;
    int size;

    public ReverseLinkedList() {
        this.size = 0;
    }

    public void InsertAtLast(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            newnode.next = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        // tail = newnode;
        size += 1;
    }

    public void Reversed() {
        Node prev = null;
        Node next = null;
        Node curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        // head.next = prev;
        head = prev;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("End");
    }
}

class InnerReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList sl = new ReverseLinkedList();

        // System.out.println("\n Size" + sl.size);
        System.out.println();
        sl.InsertAtLast(15);
        sl.InsertAtLast(25);
        sl.InsertAtLast(35);

        sl.Display();
        System.out.println();

        sl.Reversed();
        sl.Display();
    }
}
