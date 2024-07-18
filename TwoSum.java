import java.util.HashMap;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // iterate the loop

        for (int i = 0; i <= nums.length; i++) {
            int req_num = target - nums[i];

            if (map.containsKey(req_num)) {
                return new int[] { map.get(req_num), i };
            }
            map.put(nums[i], i);

        }

        return null;

    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int res[] = twoSum.twoSum(nums, target);

        if (res != null) {
            System.out.println(res[0] + "," + res[1]);
        } else {

            System.out.println("No two sum solution found");
        }
    }
}