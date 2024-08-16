public class FindTheSecondSmallestAndSecondLargest {

    static private int secondSmallest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int s_min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                s_min = min;
                min = arr[i];
            } else if (arr[i] < s_min && arr[i] != min) {
                s_min = arr[i];
            }
        }
        return s_min;
    }

    static private int secondLargest(int arr[]) {
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                s_max = max;
                max = arr[i];
            } else if (arr[i] > s_max && arr[i] != max) {
                s_max = arr[i];
            }
        }

        return s_max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };

        System.out.println("Second Largest Element is " + secondLargest(arr));
        System.out.println("Second Smallest Element is " + secondSmallest(arr));
    }

}
