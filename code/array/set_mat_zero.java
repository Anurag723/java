public class set_mat_zero {

    // Brute

    static void setMatrixZeroes1(int[][] mat) {
        int n = mat.length, m = mat[0].length;

        // To store which rows and columns are
        // supposed to mark with zeroes
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];

        // Traverse the matrix to fill rows[] and cols[]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // If the cell contains zero then mark
                // its row and column as zero
                if (mat[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Set matrix elements to zero if they
        // belong to a marked row or column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Mark cell (i, j) with zero if either
                // of rows[i] or cols[j] is true
                if (rows[i] || cols[j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }


    // Optimised

    static void setMatrixZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int c0 = 1;

        // Traverse the arr and mark first cell of each row and column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {

                    // mark i-th row
                    mat[i][0] = 0;

                    // mark j-th column
                    if (j == 0)
                        c0 = 0;
                    else
                        mat[0][j] = 0;
                }
            }
        }

        // Traverse and mark the matrix from (1, 1) to (n - 1, m - 1)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                // Check for col & row
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        // Mark the first row
        if (mat[0][0] == 0) {
            for (int j = 0; j < m; j++)
                mat[0][j] = 0;
        }

        // Mark the first column
        if (c0 == 0) {
            for (int i = 0; i < n; i++)
                mat[i][0] = 0;
        }
    }

    // n the previous approach we took two arrays to store the row's and column's status. Now instead of two auxiliary arrays, we can use the first row and first column of mat[][] to store which row elements and column elements are to be marked as zeroes.

    // So if the first cell of a row is set to 0, then all cells of that row should be updated with 0. Similarly, if the first cell of a column is set to 0, then all cells of that column should be updated to 0. Since cell (0, 0) is first cell of the first row as well as the first column, so maintain another variable, say c0 to store the status of the first column and cell(0, 0) will store the status of the first row.

    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,0,2},{1,3,1,5}};

        setMatrixZeroes1(arr);

        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}