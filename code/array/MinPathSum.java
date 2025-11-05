public public class MinPathSum {

    public static void main(String[] args) {
        // Example input grid (you can change this)
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        // Compute the minimum path sum table
        int[][] minPath = getMinPathSum(grid);

        // Print the result
        System.out.println("Minimum Path Sum Table:");
        for (int i = 0; i < minPath.length; i++) {
            for (int j = 0; j < minPath[0].length; j++) {
                System.out.print(minPath[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Computes the minimum path sum for each cell in the grid.
     * You can only move right or down.
     */
    public static int[][] getMinPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];

        // Initialize top-left cell
        dp[0][0] = grid[0][0];

        // Fill first row
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill first column
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Fill the rest of the table
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp;
    }
}