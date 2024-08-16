public class ReverseArray {

    public static void printArray(int arr[]) {
        System.out.println("Reverse Array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr);
    }

}
