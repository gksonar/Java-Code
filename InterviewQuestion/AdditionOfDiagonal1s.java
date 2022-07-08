package InterviewQuestion;

public class AdditionOfDiagonal1s {

    // To calculate Sum of Diagonals
    static int Sum_of_Diagonals1(int[][] matrix, int N) {

        int Pd = 0, Sd = 0;

        for (int k = 0; k < N; k++) {

            // Inner loop for columns
            for (int l = 0; l < N; l++) {

                if (k == l)
                    Pd += matrix[k][l];

                if ((k + l) == (N - 1))
                    Sd += matrix[k][l];
            }
        }
        if (matrix[N / 2][N / 2] == 1) {
            return (Pd + Sd - 1);
        } else {
            return (Pd + Sd);
        }

    }

    // Main driver method
    static public void main(String[] args) {

        // Input integer array
        // Custom entries in an array
        int[][] b = { { 0, 1, 0 },
                { 1, 1, 1 },
                { 0, 1, 1 } };

        // Passing the array as an argument to the
        // function defined above
        System.out.println(Sum_of_Diagonals1(b, 3));

    }
}