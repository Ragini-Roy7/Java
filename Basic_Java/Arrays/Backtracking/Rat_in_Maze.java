package Backtracking;
import java.util.*;

public class Rat_in_Maze {

    static void helper_func(int[][] matrix, int rows, int cols,
                            String path, ArrayList<String> res,
                            boolean[][] visited) {

        int n = matrix.length;

        // possible base conditions that can occur:- 4
        // if no of rows and cols are out of boundary ie. if (rows < 0 || cols < 0)
        // if rows and cols reach n (ie. total length of matrix)
        // if cell is blocked ie. matrix[rows][cols] == 0
        // if rows and cols are already visited
        if (rows < 0 || cols < 0 || rows >= n || cols >= n
                || matrix[rows][cols] == 0
                || visited[rows][cols] == true) {
            return;
        }

        // if rows and cols reached destination
        if (rows == n - 1 && cols == n - 1) {
            // store the path when destination is reached
            res.add(path);
            return;
        }

        // marking current rows and cols as visited
        visited[rows][cols] = true;

        // going down means moving one row incrementing so rows + 1
        helper_func(matrix, rows + 1, cols, path + "D", res, visited);

        // going up means moving one row decrementing so rows - 1
        helper_func(matrix, rows - 1, cols, path + "U", res, visited);

        // going right means cols + 1
        helper_func(matrix, rows, cols + 1, path + "R", res, visited);

        // going left means cols - 1
        helper_func(matrix, rows, cols - 1, path + "L", res, visited);

        // backtracking: unvisit the cell
        visited[rows][cols] = false;
    }

    public static ArrayList<String> findPath(int[][] matrix) {
        ArrayList<String> res = new ArrayList<>();
        int n = matrix.length;

        // if starting or ending cell is blocked
        if (matrix[0][0] == 0 || matrix[n - 1][n - 1] == 0) {
            return res;
        }

        boolean[][] visited = new boolean[n][n];

        helper_func(matrix, 0, 0, "", res, visited);
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        System.out.println(findPath(matrix));
    }
}