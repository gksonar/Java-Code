package LinkedList;

public class SinglyLLHead {
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

    public SinglyLLHead() {
        this.size = 0;
    }

    public void InsertAtFirst(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        size += 1;
    }

    public void InsertAtLast(int val) {
        if (head == null) {
            InsertAtFirst(val);
            return;
        }
        Node temp = head;
        Node newnode = new Node(val);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        // tail = newnode;
        size += 1;
    }

    public void InsertAtmiddle(int val, int position) {
        if (position > size)
            return;
        if (position == size) {
            InsertAtLast(val);
            return;
        }
        if (head == null || position == 0) {
            InsertAtFirst(val);
            return;
        }
        Node temp = head;
        int count = 0;
        Node newnode = new Node(val);
        Node nextnode;
        while (temp.next != null && count != position - 1) {
            temp = temp.next;
            count++;
        }
        nextnode = temp.next;
        temp.next = newnode;
        newnode.next = nextnode;
        // tail = newnode;

        size += 1;
    }

    public void DeleteAtFirst() {
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        size -= 1;
    }

    public void DeleteAtLast() {
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size -= 1;
    }

    public void DeleteAtIndex(int position) {
        if (position > size)
            return;
        if (position == size) {
            DeleteAtLast();
            return;
        }
        if (head == null || position == 0) {
            DeleteAtFirst();
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp.next != null && count != position - 1) {
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
        size -= 1;
    }

    public void FindMiddle() {
        Node slow = head;
        Node fast = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.value);
    }

    public void FindNode(int val) {
        if (head == null)
            System.out.println(head.value);
        Node temp = head;
        int count = 0;
        while (temp.value != val && temp.next != null) {
            temp = temp.next;
            count++;
            if (temp.next == null) {
                System.out.println("Not Found");
                return;
            }
        }
        System.out.println(count);
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

class InnerSinglyLLHead {
    public static void main(String[] args) {
        SinglyLLHead sl = new SinglyLLHead();
        sl.InsertAtFirst(10);
        sl.InsertAtFirst(20);
        sl.Display();
        System.out.println("");

        System.out.println("\n Size" + sl.size);
        System.out.println();
        sl.InsertAtLast(15);
        sl.InsertAtLast(25);
        sl.InsertAtLast(35);

        sl.Display();
        System.out.println();
        sl.InsertAtmiddle(100, 2);
        sl.InsertAtmiddle(120, 6);
        sl.Display();

        System.out.println("");
        sl.DeleteAtFirst();
        sl.Display();

        System.out.println("\n Delete at Last: ");
        sl.DeleteAtLast();
        sl.Display();

        System.out.println("\nDelete at Index: ");
        sl.DeleteAtIndex(4);
        sl.Display();

        System.out.println("\nFind Middle: ");
        sl.FindMiddle();

        System.out.println("\nFind Node: ");
        sl.FindNode(20);
        // sl.Display();
    }
}
