public class CelebrityProblem {

    public int celebrity(int mat[][]) {
        int n = mat.length;
        int[] iknow = new int[n];
        int[] knowme = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    iknow[i]++;
                    knowme[j]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (iknow[i] == 0 && knowme[i] == n - 1) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        CelebrityProblem cp = new CelebrityProblem();

        int[][] mat1 = {
                { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };

        int[][] mat2 = {
                { 0, 1, 1 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };

        System.out.println("Celebrity in mat1: " + cp.celebrity(mat1)); // Output: 1
        System.out.println("Celebrity in mat2: " + cp.celebrity(mat2)); // Output: -1

    }
}
