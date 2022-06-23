package Array;

import java.util.*;

public class Array_reverse {

    static void reverse(int arr[] ,int start ,int end )
    {
        int temp ;
        while(start<end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;end--;
        }
    }

    static void rotate(int arr[] , int rotate_number){
        reverse(arr, 0, arr.length-rotate_number-1);
        reverse(arr, arr.length-rotate_number, arr.length-1);
        reverse(arr,0,arr.length-1);

    }
    public static void insertAtposition(int arr[],int index, int value){
        
        for(int i=arr.length-1; i < index-1;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
    }

    public static void main(String[] args) {

        int arr[] ={1,2,3,4,5};
        //reverse(arr,0,arr.length-1);
        // rotate(arr , 2);
        System.out.println(Arrays.toString(arr));
        insertAtposition(arr, 3, 88);
        System.out.println(Arrays.toString(arr));
    }
}
