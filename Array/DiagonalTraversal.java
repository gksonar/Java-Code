package Array;

public class DiagonalTraversal {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 3, 4, 5 } };
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row + col - 1; i++) {
            for (int j = 0; j < row; j++) {
                for (int j2 = 0; j2 < col; j2++) {
                    if (j2 + j == i) {
                        if (i % 2 != 0) {
                            System.out.print(arr[j][j2] + " ");
                        } else {
                            System.out.print(arr[j2][j] + " ");
                        }
                    }

                }
            }
            System.out.println();
        }

    }
}
