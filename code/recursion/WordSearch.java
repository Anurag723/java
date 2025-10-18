public class WordSearch {
    
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int col = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (sol(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean sol(char[][] board, String word, int row, int col, int start) {
        if (start == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length ||
            board[row][col] != word.charAt(start)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '*'; // Mark as visited

        boolean res = sol(board, word, row + 1, col, start + 1) ||
                      sol(board, word, row - 1, col, start + 1) ||
                      sol(board, word, row, col + 1, start + 1) ||
                      sol(board, word, row, col - 1, start + 1);

        board[row][col] = temp; // Backtrack

        return res;
    }

    public static void main(String[] args) {
        WordSearch ws = new WordSearch();

        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word1 = "ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";

        System.out.println("Word \"" + word1 + "\" exists: " + ws.exist(board, word1)); // true
        System.out.println("Word \"" + word2 + "\" exists: " + ws.exist(board, word2)); // true
        System.out.println("Word \"" + word3 + "\" exists: " + ws.exist(board, word3)); // false
    }
}
