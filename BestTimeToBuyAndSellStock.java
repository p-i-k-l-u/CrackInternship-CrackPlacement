public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int mini = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int curr_pro = prices[i] - mini;
            maxPro = Math.max(maxPro, curr_pro);
            mini = Math.min(mini, prices[i]);
        }

        return maxPro;
    }

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = stock.maxProfit(prices);
        System.out.println("The maximum profit is " + maxProfit);

    }
}
