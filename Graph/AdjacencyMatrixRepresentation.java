package Graph;

import java.util.ArrayList;

public class AdjacencyMatrixRepresentation {
    public static void main(String[] args) {
        int n = 5, m = 7;
        // ArrayList
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            a.add(new ArrayList<>());
        }
        System.out.println(a);

        a.get(1).add(2);
        a.get(2).add(1);

        a.get(1).add(5);
        a.get(5).add(1);

        a.get(1).add(3);
        a.get(3).add(1);

        a.get(3).add(2);
        a.get(2).add(3);

        a.get(3).add(5);
        a.get(5).add(3);

        a.get(4).add(2);
        a.get(2).add(4);

        a.get(3).add(4);
        a.get(4).add(3);
        for (int i = 0; i <= n; i++) {
            System.out.print("List: " + i + "------");
            for (int j = 0; j < a.get(i).size(); j++) {
                System.out.print(a.get(i).get(j) + "|");
            }
            System.out.println();
        }
        // Array
        boolean arr[][] = new boolean[n + 1][m + 1];

        arr[1][2] = true;
        arr[2][1] = true;

        arr[1][5] = true;
        arr[5][1] = true;

        arr[1][3] = true;
        arr[3][1] = true;

        arr[3][2] = true;
        arr[2][3] = true;

        arr[3][5] = true;
        arr[5][3] = true;

        arr[4][2] = true;
        arr[2][4] = true;

        arr[3][4] = true;
        arr[4][3] = true;

        for (int i = 0; i < n; i++) {
            System.out.print(i + "|");

            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }

    }
}
