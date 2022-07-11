package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class Build {
        static int index = -1;

        Node BuildTree(int nums[]) {
            index++;
            if (nums[index] == -1) {
                return null;
            }
            Node newnode = new Node(nums[index]);
            newnode.left = BuildTree(nums);
            newnode.right = BuildTree(nums);
            return newnode;
        }

    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void PostOrder(Node root) {
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

        }

    }

    public static void main(String[] args) {
        Build b = new Build();
        int[] nums = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = b.BuildTree(nums);
        System.out.println(root.data);

        System.out.println("Preorder Traversal: ");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder Traversal: ");
        inOrder(root);

        System.out.println();
        System.out.println("PostOrder Traversal: ");
        PostOrder(root);

        System.out.println();
        System.out.println("LevelOrder Traversal: ");
        levelOrder(root);

        System.out.println();
        System.out.println("LevelOrder Traversal: ");

    }
}
