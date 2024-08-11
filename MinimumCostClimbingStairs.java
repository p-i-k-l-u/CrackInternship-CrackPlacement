public class MinimumCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] minCost = new int[n + 1];

        // as per the question
        // we start at either 0 or 1

        for (int i = 2; i <= n; i++) {
            minCost[i] = Math.min(
                    cost[i - 1] + minCost[i - 1],
                    cost[i - 2] + minCost[i - 2]);
        }
        return minCost[n];
    }

    public static void main(String[] args) {
        MinimumCostClimbingStairs mccs = new MinimumCostClimbingStairs();
        int[] cost = { 1, 2, 1, 2, 1, 1, 1 };
        int result = mccs.minCostClimbingStairs(cost);
        System.out.println(result); // Output: 4
    }
}
