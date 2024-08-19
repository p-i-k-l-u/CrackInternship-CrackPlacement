public class MaximumProductSubarrayinanArray {

    public static int maxProductSubarray(int[] arr) {
        int n = arr.length;
        int prefix = 1;
        int suffix = 1;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }

            prefix = prefix * arr[i];
            suffix = suffix * arr[n - i - 1];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 0, -4, -5 };
        int answer = maxProductSubarray(arr);
        System.out.println("The maximum product subarray is: " + answer);
    }
}
