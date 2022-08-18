package StriverPlacementSeries;

public class findDuplicateNo {
    static int findDuplicateFreq(int a[]) {
        int freq[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (freq[a[i]] == 1)
                return a[i];
            else
                freq[a[i]] = 1;
        }
        return -1;
    }

    static int findDuplicateCLL(int a[]) {
        int slow = a[0]; // 2
        int fast = a[0]; // 2
        slow = a[slow]; // a[2]== 9
        fast = a[a[fast]]; // a[a[a[0]]] a[a[2]] a[9] ==1
        while (slow != fast) {
            slow = a[slow]; // a[2]== 9
            fast = a[a[fast]]; // a[a[a[0]]] a[a[2]] a[9] ==1
        }
        fast = a[0];
        while (slow != fast) {
            slow = a[slow];
            fast = a[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int a[] = { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1 };
        System.out.println(findDuplicateFreq(a));
        System.out.println(findDuplicateCLL(a));

    }
}
