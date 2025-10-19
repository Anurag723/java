import java.util.*;

public class NQueen {
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'#');
        }

        sol(0, res, board, n);
        return res;
    }

    private void sol(int row, List<List<String>> res, char[][] board, int n){
        if(row==n){
            List<String> temp = new ArrayList<>();
            for(char[] r:board){
                temp.add(new String(r));
            }
            res.add(temp);
            return;
        }

        for(int i=0; i<n; i++){
            if(isSafe(board, row, i, n)){
                board[row][i] = 'Q';
                sol(row+1, res, board, n);
                board[row][i]='#';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n){
        for(int i=0; i<n; i++){
            if(board[i][col]=='Q')  return false;
        }

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q')    return false;
        }

        for(int i=row-1,j=col+1; i>=0 && j<n; i--, j++){
            if(board[i][j]=='Q')    return false;
        }
        return true;
    }

    // Runner / main method
    public static void main(String[] args) {
        int n = 4; // You can change n to any value
        NQueen solver = new NQueen();
        List<List<String>> solutions = solver.solveNQueens(n);

        // Print all solutions
        System.out.println("Total Solutions: " + solutions.size());
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println(); // Separate each solution
        }
    }
}
