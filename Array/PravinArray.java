package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PravinArray {

    public static void BubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < (a.length - 1) - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void Selection(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void duplicates(int a[]) {
        // n^2 ;
        // space cpmp]]]
        Arrays.sort(a);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                al.add(a[i]);
            }
        }
        System.out.println(al);
    }

    public static void reverse(int a[]) {
        // Extra Array Used
        // int temp [] = new int[a.length];
        // int k =0;
        // for (int i = a.length-1; i>=0 ; i--) {
        // temp[k++]=a[i];
        // }
        // System.out.println(Arrays.toString(temp));

        // 10 20 30 40 50

    }

    public static void reverse1(int a[] , int start , int end) {
        while (start < end) {
            int temp = a[start];      // 10
            a[start] = a[end]; //20 
            a[end] = temp;      //10
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));

    }

    public static void reverse1(int a[] , int start , int end) {
        while (start < end) {
            int temp = a[start];      // 10
            a[start] = a[end]; //20 
            a[end] = temp;      //10
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));

    }

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50 };
        // duplicates(a);
        // BubbleSort(a);
        // Selection(a);
        // reverse1(a,0,a.length-1); // 50 40 30 2 10

        String str = "GeeksforGeeks";
        String strnew = "for";
        int pos= 0;
        for (int i = 0; i < str.length(); i++) {
            if(strnew.charAt(0)==str.charAt(i))
                pos=i;
        }
        String newS = str.substring(pos, pos+strnew.length());
        System.out.println((newS.equals(strnew))?true:false;);
    }
}
