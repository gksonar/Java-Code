package Tree;

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = Insert(root.left, val);
        } else {
            root.right = Insert(root.right, val);
        }
        return root;
    }

    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return Search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else if (root.data < key) {
            return Search(root.right, key);
        }
        return false;

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 50, 40, 30, 20, 5 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = Insert(root, arr[i]);
        }
        inOrder(root);
        System.out.println(Search(root, 25));
    }

}
