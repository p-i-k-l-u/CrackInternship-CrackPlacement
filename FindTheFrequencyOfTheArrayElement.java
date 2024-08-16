import java.util.HashMap;
import java.util.Map;

public class FindTheFrequencyOfTheArrayElement {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 9, 7, 7, 1, 4, 7, 5, 3, 2, 1 };

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        // Print the hashmap using entry set
        System.out.println("Element | Frequency");
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "       | " + entry.getValue());
        }
    }
}
