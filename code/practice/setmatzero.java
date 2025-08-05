package code.practice;

public class setmatzero {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length; int m = matrix[0].length;
        int[] rowmat = new int[n];
        int[] colmat = new int[m];

        for(int i=0; i<n; i++){
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]==0){
                    rowmat[i] = 1;
                    colmat[j] = 1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for (int j = 0; j < m; j++){
                if (rowmat[i]==1 || colmat[j]==1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
