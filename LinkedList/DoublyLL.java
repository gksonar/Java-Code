package LinkedList;

public class DoublyLL {

    class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;

    public void InsertAtFirst(int val) {
        Node newnode = new Node(val);

        newnode.next = head;
        newnode.prev = null;
        // head.prev = newnode;

        if (head != null) {
            head.prev = newnode;
        }
        head = newnode;

    }

    public void InsertAtLast(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            newnode.prev = null;
            head = newnode;
            return;
        }
        Node temp = head;
        newnode.next = null;
        if (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;

    }

    public void Display1() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.print("END\n");

    }

    public void Display() {
        Node temp = head;
        Node Curr = null;
        while (temp != null) {
            System.out.print(temp.val + "->");
            Curr = temp;
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();

        while (Curr != null) {
            System.out.print(Curr.val + "->");
            // Curr=temp;
            Curr = Curr.prev;
        }
        System.out.print("Start\n");

    }

    public static void main(String[] args) {
        DoublyLL dl = new DoublyLL();
        dl.InsertAtFirst(10);
        dl.InsertAtFirst(20);
        dl.InsertAtFirst(30);
        dl.InsertAtFirst(40);
        // dl.Display();
        dl.InsertAtLast(35);
        dl.Display1();
        dl.InsertAtLast(35);
        // dl.Display();
    }
}
