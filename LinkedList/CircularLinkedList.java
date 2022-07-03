package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;

    }

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void Insert(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;

        }
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;

    }

    public boolean isCyclic() {
        Node slow = head;
        Node fast = head;
        while (fast.next != head && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;

    }

    public void Display() {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("head");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.Insert(10);
        cll.Insert(20);
        cll.Insert(30);
        cll.Insert(40);
        cll.Display();
        System.out.println(cll.isCyclic());
    }
}
