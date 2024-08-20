import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumEquals_K {

    public static int findSubarraySumWithGivenSum(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0;
        int count = 0;

        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - k;

            count += mpp.getOrDefault(remove, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        int k = 6;
        int count = findSubarraySumWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + count);
    }
}
