public class HouseRobber {

    public int rob(int[] nums) {
        // if only 1 element, just return it
        if (nums.length < 2) {
            return nums[0];
        }

        int[] dp = new int[nums.length];

        // memoize the maximum loots at the first 2 indices
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] nums = { 2, 7, 9, 3, 1 };
        int result = hr.rob(nums);
        System.out.println(result); // Output: 12
    }
}
