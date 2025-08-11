public class rotateby90{
    public void rotate(int[][] matrix) {
        transpose(matrix);

        int n = matrix.length;
        int m = matrix[0].length-1;

        for(int i = 0; i<n; i++){
            for(int j=0; j<=m/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m-j];
                matrix[i][m-j] = temp;
            }
        }
    }
    public void transpose(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

     public static void main(String[] args) {
        rotateby90 obj = new rotateby90();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        obj.rotate(matrix);

        System.out.println("Matrix after 90-degree rotation:");
        printMatrix(matrix);
    }

    // Utility method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}