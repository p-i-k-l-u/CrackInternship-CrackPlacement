public class CoinChange_2 {

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n + 1][amount + 1];

        // Initialize the dp array
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                if (i == 0) {
                    dp[i][j] = 0;
                }
                if (j == 0) {
                    dp[i][j] = 1;
                }
            }
        }

        // Fill the dp array
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amount];
    }

    public static void main(String[] args) {
        CoinChange_2 coinChange = new CoinChange_2();
        int[] coins = { 1, 2, 5 };
        int amount = 5;
        int result = coinChange.change(amount, coins);
        System.out.println("Number of ways to make change: " + result);
    }
}
