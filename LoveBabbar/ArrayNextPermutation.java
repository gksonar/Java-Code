package LoveBabbar;

import java.util.Arrays;

public class ArrayNextPermutation {
    static public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1)
            return;
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static public void reverse(int arr[], int start, int end) {
        while (start < end) {
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
        }
    }

    static public void swap(int arr[], int start, int end) {
        arr[start] = arr[start] ^ arr[end];
        arr[end] = arr[start] ^ arr[end];
        arr[start] = arr[start] ^ arr[end];
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 1 };
        nextPermutation(a);
    }
}
