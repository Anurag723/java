public class rotmat {
    public void rotate(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] res = new int[m][n];

        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                res[j][i] = matrix[i][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = res[i][m-j-1];
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
