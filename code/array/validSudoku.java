import java.util.*;

class validSudoku{
    public static boolean isvalid(char[][] board){
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for(int i=0; i<9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int r = 0; r<9; r++){
            for(int c = 0; c<9; c++){
                char val = board[r][c];

                if (val=='.') {
                    continue;
                }

                int boxi = (r/3)*3+(c/3);

                if (row[r].contains(val) || col[c].contains(val) || box[boxi].contains(val)) {
                    return false;
                }

                row[r].add(val);
                col[c].add(val);
                box[boxi].add(val);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean isValid = isvalid(board);

        if (isValid) {
            System.out.println("The Sudoku board is valid.");
        } else {
            System.out.println("The Sudoku board is NOT valid.");
        }
    }
}