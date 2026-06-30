package Arrays.LeetCode.simulation;

public class diagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0)
            return new int[0];

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];

        int row = 0, col = 0, dir = 1; // dir = 1 up-right, -1 down-left

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];

            if (dir == 1) { // moving up-right
                if (col == n - 1) {
                    row++;
                    dir = -1;
                } else if (row == 0) {
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            } else { // moving down-left
                if (row == m - 1) {
                    col++;
                    dir = 1;
                } else if (col == 0) {
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}
