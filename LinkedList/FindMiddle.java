
package LinkedList;

public class FindMiddle {
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

    public FindMiddle() {
        this.size = 0;
    }

    public void InsertAt(int val) {
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

    public void FindMiddleNode() {
        Node slow = head;
        Node fast = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.value);
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

class InnerFindMiddle {
    public static void main(String[] args) {
        FindMiddle sl = new FindMiddle();
        sl.InsertAt(10);
        sl.InsertAt(20);
        sl.InsertAt(30);
        sl.InsertAt(40);
        sl.InsertAt(50);
        sl.Display();
        System.out.println("\nFind Middle: ");
        sl.FindMiddleNode();
    }
}
