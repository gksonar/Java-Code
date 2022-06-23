package Array;

import java.util.*;
public class Array_left_rotate {

    static void reverse(int arr[] , int start , int end)
    {
        int temp ; 
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr [end] ; 
            arr [end] = temp ;
            start ++ ; 
            end -- ;
        }
    }
     
    static void left_rotate (int arr[] , int rotate){
        reverse(arr, 0 , rotate-1);
        reverse(arr, rotate , arr.length-1);
        reverse(arr, 0 , arr.length -1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rotate = sc.nextInt();
        int arr [] = new int[n];
        
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        left_rotate(arr, rotate);
        //System.out.println(Arrays.toString(arr));
        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
            
        }
        sc.close();
    }
}
