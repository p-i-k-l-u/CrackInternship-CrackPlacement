public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum - nums[i];

            if (rightSum == leftSum) {
                return i;
            }

            leftSum = leftSum + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        FindPivotIndex find = new FindPivotIndex();
        int[] nums1 = { 1, 7, 3, 6, 5, 6 };
        int[] nums2 = { 1, 2, 3 };
        int[] nums3 = { 2, 1, -1 };

        System.out.println("Pivot index of the nums1:" + find.pivotIndex(nums1));
        System.out.println("Pivot index of the nums2" + find.pivotIndex(nums2));
        System.out.println("Pivot index of the nums3 " + find.pivotIndex(nums3));

    }

}
