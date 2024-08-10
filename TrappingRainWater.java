public class TrappingRainWater {

    public int trap(int[] height) {
        int n = height.length;

        int[] maxl = new int[n];
        int[] maxr = new int[n];

        maxl[0] = height[0];

        for (int i = 1; i < n; i++) {
            maxl[i] = Math.max(maxl[i - 1], height[i]);
        }

        maxr[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxr[i] = Math.max(maxr[i + 1], height[i]);
        }

        int[] water = new int[n];

        for (int i = 0; i < n; i++) {
            water[i] = Math.min(maxl[i], maxr[i]) - height[i];
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + water[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        TrappingRainWater trw = new TrappingRainWater();
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int result = trw.trap(height);
        System.out.println("The amount of trapped rainwater is: " + result);
    }
}
