package Striver.Array;

import java.util.Arrays;

public class ArrayZeroesOneSide {
 public static void main(String[] args) {
    int a [] = {1,2,0,0,4,5,6,0,0};
    int i =0;
    int j =1;
    while (i<a.length && j<a.length) {
        if (a[j]!=0) {
            int temp = a[i];
            a[i] =a[j];
            a[j]= temp;
            i++;
        }
        j++;
    }
    System.out.println(Arrays.toString(a));

 }   
}
