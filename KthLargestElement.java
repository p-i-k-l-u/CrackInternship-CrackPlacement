import java.util.PriorityQueue;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        KthLargestElement kthLargest = new KthLargestElement();
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        int result = kthLargest.findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is " + result);
    }
}
