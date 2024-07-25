public class CountingBits {

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    public static void main(String[] args) {

        int n = 2; // Specific input for testing

        // // Check if at least one command-line argument has been passed
        // if (args.length < 1) {
        // System.out.println("Error: Please provide an integer as a command-line
        // argument.");
        // return;
        // }

        // Create an instance of the CountingBits class
        CountingBits cb = new CountingBits();

        // Call the countBits method with the input
        int[] result = cb.countBits(n);

        // Print the returned array
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(result[i]);
        }
        System.out.println("]");
    }
}
