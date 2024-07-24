public class UniquePath {

    public int uniquePaths(int row, int col) {
        long ans = 1;
        for (int i = 1; i <= row - 1; i++) {
            ans = ans * (col - 1 + i) / i;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        UniquePath up = new UniquePath();
        int m = 3;
        int n = 7;
        int result = up.uniquePaths(m, n);
        System.out.println("The number of unique paths is: " + result);
    }
}
