
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] mem = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (mem[j] + 1 > mem[i]) {
                        mem[i] = mem[j] + 1;
                    }
                }
            }
        }

        int maxIndex = 0;
        for (int i = 0; i < mem.length; i++) {
            if (mem[i] > mem[maxIndex]) {
                maxIndex = i;
            }
        }
        return mem[maxIndex] + 1;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();

        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
        int length = solution.lengthOfLIS(nums);

        System.out.println("The length of the longest increasing subsequence is: " + length);
    }
}
