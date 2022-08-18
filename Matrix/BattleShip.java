package Matrix;

public class BattleShip {
    static class BattelShipofBoard {
        char name;
        int x;
        int y;

        BattelShipofBoard(char n, int _x, int _y) {
            name = n;
            x = _x;
            y = _y;
        }
    }

    public static void solve(BattelShipofBoard mat[]) {
        char matrix[][] = new char[7][8];
        boolean vis[][] = new boolean[7][8];
        for (BattelShipofBoard bo : mat) {
            matrix[bo.x][bo.y] = bo.name;
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= 7; j++) {
                if (vis[i][j] == false && matrix[i][j] != '\u0000') {
                    bfs(i, j, matrix, vis);
                    matrix[i][j] = Character.toUpperCase(matrix[i][j]);
                }
            }
        }
        // for (int i = 1; i < 7; i++) {
        // for (int j = 1; j < 8; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
    }

    private static void bfs(int x, int y, char matrix[][], boolean vis[][]) {
        if (x > 6 || y > 7 || x < 0 || y < 0)
            return;
        if (vis[x][y] || matrix[x][y] == '\u0000')
            return;
        vis[x][y] = true;
        matrix[x][y] = Character.toLowerCase(matrix[x][y]);
        bfs(--x, y, matrix, vis);
        bfs(x, ++y, matrix, vis);
        bfs(--x, ++y, matrix, vis);
        bfs(++x, --y, matrix, vis);

    }

    public static void main(String[] args) {
        BattelShipofBoard[] obj = new BattelShipofBoard[4];
        obj[0] = new BattelShipofBoard('A', 6, 2);
        obj[1] = new BattelShipofBoard('A', 5, 3);
        obj[2] = new BattelShipofBoard('Z', 4, 4);
        obj[3] = new BattelShipofBoard('Z', 1, 7);

        // obj[0] = new BattelShipofBoard('A', 2, 6);
        // obj[1] = new BattelShipofBoard('A', 3, 5);
        // obj[2] = new BattelShipofBoard('Z', 4, 4);
        // obj[3] = new BattelShipofBoard('Z', 7, );
        solve(obj);
    }
}