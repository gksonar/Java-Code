package LinkedList;

public class DoublyLinkedList {
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

        if (head != null) {
            head.prev = newnode;
        }
        head = newnode;
    }

    public void InsertAtLast(int val) {
        Node newnode = new Node(val);
        Node temp = head;
        if (head == null) {
            head.next = newnode;
            newnode.prev = null;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = null;
        newnode.prev = temp;

    }

    public void InsertAtLocation(int val, int pos) {
        int size = 0;
        Node temp = head;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        if (pos > size)
            return;
        if (pos == size) {
            InsertAtLast(val);
            return;
        }
        if (pos == 0 || head == null) {
            InsertAtFirst(val);
            return;
        }
        int count = 0;
        temp = head;
        Node newnode = new Node(val);
        Node nextnode;
        while (temp.next != null && count != pos - 1) {
            temp = temp.next;
            count++;

        }
        nextnode = temp.next;
        temp.next = newnode;
        newnode.prev = temp;
        newnode.next = nextnode;
        nextnode.prev = newnode;
    }

    public void Delete(int val) {
        Node temp = head;
        while (temp.next != null && temp.val != val) {
            temp = temp.next;
        }
        if (temp.next == null) {
            temp = temp.prev;
            temp.next = null;
            return;
        }
        Node nextnode = temp.next;
        temp = temp.prev;
        temp.next = nextnode;
        nextnode.prev = temp;
    }

    public void Display() {
        Node temp = head;
        Node curr = null;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            curr = temp;
            temp = temp.next;
        }
        System.out.println("END\n");
        while (curr != null) {
            System.out.print(curr.val + "-->");
            curr = curr.prev;
        }
        System.out.println("START\n");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.InsertAtFirst(10);
        dll.InsertAtFirst(20);
        dll.InsertAtFirst(30);

        dll.Display();
        dll.InsertAtLast(25);
        dll.InsertAtLast(35);
        dll.Display();

        dll.InsertAtLocation(22, 2);
        // dll.InsertAtLocation(35,);
        dll.Display();

        dll.Delete(35);
        // dll.InsertAtLocation(35,);
        dll.Display();

    }

}
