package Arrays.LeetCode;
import java.util.*;
public class setMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        //edge case
        if (matrix == null || matrix.length == 0) {
            return;
        }
        //we are checking if its 0 or not (boolean flag)
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //if rows or cols =0 then update the boolean flag
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;

                }
            }
        }
        //main condition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
       int[][] matrix = {{1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};
        setZeroes(matrix);
        System.out.println("matrix after zeroes");
        for(int [] row:matrix) {
            System.out.println(Arrays.toString(row));
        }


    }
}
