package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(12);
        list.add(25);
       
        System.out.println(list.size());
        System.out.println("Original Array List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List" + list);

        // list.set(2, 14);
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        list.add(2, 14);
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
        System.out.println("Insert 14 at 2nd position; " + list);

    }
}
