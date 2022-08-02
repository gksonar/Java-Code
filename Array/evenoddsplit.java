package Array;

public class evenoddsplit {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 15, 87 };
        int even = 0, odd = 0;

        while (true) {
            while (even < arr.length) {
                if (arr[even] % 2 == 0) {
                    System.out.print(arr[even] + " ");
                    even++;
                    break;
                }
                even++;
            }
            while (odd < arr.length) {
                if (arr[odd] % 2 != 0) {
                    System.out.print(arr[odd] + " ");
                    odd++;
                    break;
                }
                odd++;
            }

            if (even == arr.length - 1 && odd == arr.length - 1)
                break;
        }
    }
}