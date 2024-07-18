public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray array = new RemoveDuplicatesFromSortedArray();
        int[] nums = { 1, 1, 2 };
        int k = array.removeDuplicates(nums);
        System.out.println("The length of the modified array is: " + k);
        System.out.print("The modified array is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
