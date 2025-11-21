import java.util.Arrays;

public class MaxRectangle {

    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                heights[j] = (matrix[i][j] == '1') ? heights[j] + 1 : 0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    public static int largestRectangleArea(int[] height) {
        int n = height.length;
        int[] leftLowest = new int[n];
        int[] rightLowest = new int[n];

        Arrays.fill(leftLowest, -1);
        Arrays.fill(rightLowest, n);

        for (int i = 1; i < n; i++) {
            int p = i - 1;
            while (p >= 0 && height[p] >= height[i]) {
                p = leftLowest[p];
            }
            leftLowest[i] = p;
        }

        for (int i = n - 2; i >= 0; i--) {
            int p = i + 1;
            while (p < n && height[p] >= height[i]) {
                p = rightLowest[p];
            }
            rightLowest[i] = p;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int width = rightLowest[i] - leftLowest[i] - 1;
            res = Math.max(res, height[i] * width);
        }

        return res;
    }

    public static void main(String[] args) {
        MaxRectangle obj = new MaxRectangle();

        char[][] matrix = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };

        int result = obj.maximalRectangle(matrix);
        System.out.println("Maximal Rectangle = " + result);
    }
}
