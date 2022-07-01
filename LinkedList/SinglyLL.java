package LinkedList;

public class SinglyLL {

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

    private Node head, tail;
    int size;

    public SinglyLL() {
        this.size = 0;
    }

    public void InsertAtFirst(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        if (tail == null)
            tail = head;
        size += 1;

    }

    public void InsertAtLast(int val) {
        if (tail == null) {
            InsertAtFirst(val);
            return;
        }
        Node newnode = new Node(val);
        tail.next = newnode;
        tail = newnode;

        size += 1;
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

class InnerSinglyLL {
    public static void main(String[] args) {
        SinglyLL sl = new SinglyLL();
        sl.InsertAtFirst(10);
        sl.InsertAtFirst(20);
        sl.Display();
        System.out.println("\n Size" + sl.size);
        System.out.println();
        sl.InsertAtLast(15);
        sl.InsertAtLast(25);
        sl.InsertAtLast(35);

        sl.Display();

    }

}
