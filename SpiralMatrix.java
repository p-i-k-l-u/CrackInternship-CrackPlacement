import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if (matrix.length == 0)
            return res;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // traverse right
            for (int j = colBegin; j <= colEnd; j++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // traverse Down

            for (int j = rowBegin; j <= rowEnd; j++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            if (colBegin <= colEnd) {
                // traverse up

                for (int j = rowEnd; j >= rowBegin; j--) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        System.out.println(result);
    }

}
