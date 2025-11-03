public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;
        int temp = 1;

        while (top <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                res[top][i] = temp++;
            }
            top++;

            if (top <= down && left <= right) {
                for (int i = top; i <= down; i++) {
                    res[i][right] = temp++;
                }
                right--;
            }

            if (left <= right && top <= down) {
                for (int i = right; i >= left; i--) {
                    res[down][i] = temp++;
                }
                down--;
            }

            if (left <= right && top <= down) {
                for (int i = down; i >= top; i--) {
                    res[i][left] = temp++;
                }
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        SpiralMatrixII sm = new SpiralMatrixII();
        int n = 4;
        int[][] matrix = sm.generateMatrix(n);

        System.out.println("Spiral " + n + "x" + n + " Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
