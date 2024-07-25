public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        if (rows == 0)
            return 0;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];

        dp[0][0] = grid[0][0]; // 1st element is starting point

        // Fill 1st row
        for (int i = 1; i < cols; ++i) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        // Fill 1st column
        for (int i = 1; i < rows; ++i) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Now fill the rest of the cells
        for (int i = 1; i < rows; ++i) {
            for (int j = 1; j < cols; ++j) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[rows - 1][cols - 1];
    }

    public static void main(String[] args) {
        MinimumPathSum solution = new MinimumPathSum();
        int[][] grid = {
                { 1, 3, 1 },
                { 1, 5, 1 },
                { 4, 2, 1 }
        };
        int result = solution.minPathSum(grid);
        System.out.println("Output: " + result); // Output: 7
    }
}
