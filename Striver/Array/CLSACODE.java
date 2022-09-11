package Striver.Array;

import java.util.Arrays;

class CLSACODE {
    public static int main(String args[]) {
        int a[] = { -1, -9, 0, 5, -7 };
        Arrays.sort(a);
        int postSum = 0, cur = 0, res = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            postSum += a[i];
            cur += postSum;
            res = Math.max(res, cur);
        }

        System.out.println(res);
        return res;
    }
}