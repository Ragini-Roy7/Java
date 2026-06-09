package Arrays.LeetCode;

public class SudoKuSolver {

    // main function that starts solving
    public static boolean sudoku_solver(char[][] board) {
        return solve(board);
    }

    // creating helper function (recursive backtracking)
    // traverse the entire board to check if digits exist or not
    // if exist, solution doesn’t exist
    // main condition:
    // if empty cell found -> check row-wise, col-wise, grid-wise
    // if safe -> place digit
    // fill all the empty rows, cols with digits from (1-9)
    // if it becomes unsolveable (no digit fits) -> backtrack
    // we must have filled wrong digits somewhere
    // backtrack to previous state of board
    // make the seated position empty again i.e. board[row][col] = '.'

    private static boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                // check only EMPTY cells
                if (board[row][col] == '.') {

                    // try digits from 1 to 9
                    for (char ch = '1'; ch <= '9'; ch++) {

                        // check safety
                        if (isSafe(board, row, col, ch)) {

                            board[row][col] = ch; // choosing digit to fill

                            // recursive call
                            if (solve(board))
                                return true;

                            // backtrack if digits from 1-9 cannot be used
                            // means we must have filled wrong digit
                            // so backtrack to previous position
                            board[row][col] = '.';
                        }
                    }
                    // no digit can be placed here -> backtrack
                    return false;
                }
            }
        }
        // no empty cell left -> sudoku solved
        return true;
    }

    // to check if it is safe to place the digit
    // row-wise, col-wise, grid-wise
    private static boolean isSafe(char[][] board, int row, int col, char ch) {

        for (int i = 0; i < 9; i++) {

            // row -> fixed, move columns
            if (board[row][i] == ch)
                return false;

            // column -> fixed, move rows
            if (board[i][col] == ch)
                return false;

            // grid (3x3 box)
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if (board[boxRow][boxCol] == ch)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(sudoku_solver(board));
    }
}