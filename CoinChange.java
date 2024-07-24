public class CoinChange {

    // public int coinChange(int[] coins, int amount) {

    // int n = coins.length;
    // int[][] t = new int[n + 1][amount + 1];

    // for (int i = 0; i <= n; i++) {
    // for (int j = 0; j <= amount; j++) {
    // if (j == 0) {
    // t[i][j] = 0;
    // } else {
    // t[i][j] = Integer.MAX_VALUE - 1;
    // }
    // }
    // }

    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= amount; j++) {
    // if (coins[i - 1] <= j) {
    // t[i][j] = Math.min(t[i][j - coins[i - 1]] + 1, t[i - 1][j]);

    // } else {
    // t[i][j] = t[i - 1][j];
    // }
    // }
    // }
    // return t[n][amount] == Integer.MAX_VALUE - 1 ? -1 : t[n][amount];

    // }

    public int coinChange(int[] coins, int amount) {

        // Check edge case
        if (amount < 1)
            return 0;

        // Create DP array
        int[] minCoinsDP = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {

            minCoinsDP[i] = Integer.MAX_VALUE;

            // Try each coin
            for (int coin : coins) {
                if (coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE)
                    minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
            }
        }

        return minCoinsDP[amount] == Integer.MAX_VALUE ? -1 : minCoinsDP[amount];
    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        int result = cc.coinChange(coins, amount);
        System.out.println("The minimum number of coins needed is: " + result);
    }
}
