package Striver.Recursion;

public class Print1toNNumbers {
    public static void print1toNrecursive(int i, int no) {
        if (i > no)
            return;
        System.out.println(i);
        print1toNrecursive(++i, no);
    }

    public static void main(String[] args) {
        int i = 1;
        int no = 10;
        print1toNrecursive(i, no);
    }
}
