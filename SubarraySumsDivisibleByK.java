import java.util.HashMap;

public class SubarraySumsDivisibleByK {

    public int subarrayDivisibleByK(int[] nums, int k) {
        // initialize the count of the subarray , prefixsum hashmap for remainders

        int count = 0;
        int prefixsum = 0;

        HashMap<Integer, Integer> preMap = new HashMap<>();
        preMap.put(0, 1); // to handle the subarray that start from the begining

        for (int num : nums) {
            prefixsum += num; // calculate the remainder of the prefix sum divisible by K

            int mod = prefixsum % k;

            // adjust the negative remainder to be positive

            if (mod < 0) {
                mod += k;
            }

            if (preMap.containsKey(mod)) {
                count += preMap.get(mod);
                preMap.put(mod, preMap.get(mod) + 1);
            } else {
                preMap.put(mod, 1);
            }
        }

        return count;

    }

    public static void main(String[] args) {
        SubarraySumsDivisibleByK obj = new SubarraySumsDivisibleByK();
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        int result = obj.subarrayDivisibleByK(nums, k);
        System.out.println("The number of subarrays where the sum of numbers is divisible by K is: " + result);
    }

}
