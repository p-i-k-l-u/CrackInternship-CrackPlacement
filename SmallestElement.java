public class SmallestElement {

    public static int smallestElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 1, 3, 7 };
        System.out.println("The Smmalest Element in the array :" + smallestElement(arr));

    }
}
