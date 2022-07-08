package Array;

public class Array_remove_duplicates {

    static void remove_duplicates(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[count] = arr[i];
                count++;
            }
        }

        arr[count++] = arr[arr.length - 1];

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 3, 4, 5 };
        // reverse(arr,0,arr.length-1);
        remove_duplicates(arr);
        // System.out.println(Arrays.toString(arr));
    }

}
