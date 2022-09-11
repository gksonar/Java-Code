package Striver.BasicHashing;

import java.util.LinkedHashMap;

public class ArrayNumberOcc {
    public static void NumberOfOcc(int a[]) {
        int n = a.length;
        int count = 0;
        int max = 0, posMax = 0;
        int min = Integer.MAX_VALUE, posMin = 0;
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n - 1; i++) {
            count = 1;
            if (vis[i] == true)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    vis[j] = true;
                    count++;
                }
            }
            if (max <= count) {
                posMax = i;
                max = count;
            }
            if (min >= count) {
                posMin = i;
                min = count;
            }

            // max = Math.max(max, count);
            // min = Math.min(min, count);
            System.out.print(a[i] + " " + count + ",");

        }
        System.out.println();
        System.out.println(a[posMax] + " " + max);
        System.out.println(a[posMin] + " " + min);

    }

    public static void Hashmaptech(int a[]) {
        int n = a.length;
        LinkedHashMap<Integer, Integer> hs = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (hs.containsKey(a[i])) {
                hs.put(a[i], hs.get(a[i]) + 1);
            } else
                hs.put(a[i], 1);
        }
        System.out.println(hs);
    }

    public static void main(String[] args) {
        NumberOfOcc(new int[] { 10, 15, 5, 10, 15, 10 });
        Hashmaptech(new int[] { 10, 15, 5, 10, 15, 10 });
    }
}
