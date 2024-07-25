public class DecodWays {

    public int numDecodings(String s) {
        // using dynamic programming
        // create a dp
        int n = s.length();
        int[] dp = new int[n + 1];
        // for 0th & 1th index
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            int twoDigit = Integer.valueOf(s.substring(i - 2, i));

            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        DecodWays decoder = new DecodWays();

        String s1 = "12";
        int output1 = decoder.numDecodings(s1);
        System.out.println("Input: " + s1 + "\nOutput: " + output1);

        String s2 = "226";
        int output2 = decoder.numDecodings(s2);
        System.out.println("Input: " + s2 + "\nOutput: " + output2);

        String s3 = "06";
        int output3 = decoder.numDecodings(s3);
        System.out.println("Input: " + s3 + "\nOutput: " + output3);
    }

}
