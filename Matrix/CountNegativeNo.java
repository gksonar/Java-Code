package Matrix;

public class CountNegativeNo {
    public static int countNegative(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] >= 0) {
                    count++;
                    // count += (col - j);
                    // break;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = { { 2, 2, 0, -1, -1 }, { 2, 2, 0, -1, -1 }, { 2, 2, 0, -1, -1 }, { 2, 2, 0, -1, -1 },
                { 2, 2, 0, -1, -1 } };
        int a = countNegative(arr);
        System.out.println(a);

    }
}
