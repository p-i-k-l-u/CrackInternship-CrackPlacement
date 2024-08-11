import java.util.*;

public class DailyTemperature {

    public int[] dailyTemperature(int[] temperature) {
        Stack<Integer> st = new Stack<>();
        int n = temperature.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperature[st.peek()] <= temperature[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        DailyTemperature dt = new DailyTemperature();
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] result = dt.dailyTemperature(temperatures);
        System.out.println(Arrays.toString(result));
    }
}
