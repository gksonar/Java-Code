package Array;

import java.util.*;
import java.util.Scanner;

public class Array_declaration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // 2-d
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr1[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int J = 0; J < cols; J++) {
                System.out.print(arr1[i][J] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
