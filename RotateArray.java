public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // this line is added to handle the case when k > n

        reverse(nums, 0, n - 1);// first 0 to n-1
        reverse(nums, 0, k - 1);// reverse first k element
        reverse(nums, k, n - 1);// reverse remaining element

    }

    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        System.out.println("Original array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        rotateArray.rotate(nums, k);

        System.out.println("\nRotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
