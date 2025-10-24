public class pracsud {

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

        System.out.println("Original Sudoku:");
        printBoard(board);

        pracsud solver = new pracsud();
        solver.solveSudoku(board);

        System.out.println("\nSolved Sudoku:");
        printBoard(board);
    }

    // Wrapper method
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    // Recursive backtracking solver
    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {

                    for (char num = '1'; num <= '9'; num++) {
                        if (possible(board, i, j, num)) {
                            board[i][j] = num;

                            if (solve(board)) {
                                return true;
                            }

                            board[i][j] = '.'; // Backtrack
                        }
                    }

                    return false; // No valid number for this cell
                }
            }
        }
        return true; // All cells filled successfully
    }

    // Check if num can be placed in (row, col)
    private boolean possible(char[][] board, int row, int col, char num) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num)
                return false;
        }

        // Check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    // Utility to print the Sudoku board
    private static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0)
                System.out.println("------+-------+------");

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
