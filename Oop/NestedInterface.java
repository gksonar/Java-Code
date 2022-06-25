package Oop;

import java.util.*;

interface OuterNestedInterface {
    interface InnerNestedInterface {
        // final boolean answer = false;
        abstract int odd();
    }
}

public class NestedInterface implements OuterNestedInterface.InnerNestedInterface {
    Scanner sc = new Scanner(System.in);

    @Override
    public int odd() {

        int num = sc.nextInt();
        if (num % 2 == 1)
            return num;
        else
            return -1;

    }

}

class NestedInterfaceCall {
    private static int odd;

    public static void main(String[] args) {
        NestedInterface NI = new NestedInterface();
        odd = NI.odd();

        if (odd != -1) {
            System.out.println("Odd");
        } else {
            System.out.println("even");
        }
    }
}