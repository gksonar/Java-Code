package Array;

import java.util.*;

public class Array_initialization {
    
    public static void main(String[] args) {

        //1-D
        int arr[] = {10,20,30,40};
        System.out.println(Arrays.toString(arr));


        //2-D

        int arr1[][] = {{1,2,3},{4,5,6},{6,7,8}};
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++)
                System.out.print(arr1[i][j]+" ");
            System.out.println();
        }
        
            
    }
}
