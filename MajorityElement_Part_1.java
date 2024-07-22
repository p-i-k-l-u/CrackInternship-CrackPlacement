public class MajorityElement_Part_1 {

    public int majorityElement(int[] nums) {
        int candidate = 0;
        int point = 0;

        for (int i = 0; i < nums.length; i++) {
            if (point == 0) {
                candidate = nums[i];
            }

            if (candidate == nums[i]) {
                point++;
            } else {
                point--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {

        MajorityElement_Part_1 me = new MajorityElement_Part_1();
        int[] nums = { 3, 2, 3 };

        int result = me.majorityElement(nums);
        System.out.println("The majority Element is :" + result);

    }
}
