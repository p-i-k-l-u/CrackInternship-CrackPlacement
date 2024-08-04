public class SingleOne {

    public static int singleNumber(int[] nums) { // Made this method static
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value = value ^ nums[i];
        }
        return value;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums)); // Now this will work
    }
}
