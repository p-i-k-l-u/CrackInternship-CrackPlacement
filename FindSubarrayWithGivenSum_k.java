import java.util.HashMap;

public class FindSubarrayWithGivenSum_k {

    public static void findSubarraySumGivenk(int arr[], int target) {
        int currSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            // special case
            if (currSum - target == 0) {
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(currSum - target)) {
                start = map.get(currSum - target) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        if (end == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(start + " " + end);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int target = 7;
        findSubarraySumGivenk(arr, target);
    }
}
