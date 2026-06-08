package Backtracking;

public class N_Queens {

    public static boolean isSafe(char board[][], int row, int col) {

        // vertical up -> means rows are dec by -1 as we are moving one row backwards
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonally left -> means rows and cols both are dec by -1
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonally right -> means rows are dec by -1 and cols inc by +1
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char[][] board, int row) {

        // base fn
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // main recursive
        for (int j = 0; j < board.length; j++) {

            // check if queen can be placed safely
            if (isSafe(board, row, j)) {

                board[row][j] = 'Q';

                // moving to next iteration (next row)
                nQueens(board, row + 1);

                // backtrack -> to unplace the queen for exploring all the possible ways
                board[row][j] = 'X';
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------- chess board ---------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
    }
}