package Array;

public class TwoDMatrixDiagonalPrint {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
