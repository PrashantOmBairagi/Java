package CoreJava;

public class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // fixing first element of rows
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = grid[i][j] == 0 ? 1 : 0;
                }
            }
        }

        // fixing columns (start from column 1)
        for (int i = 1; i < m; i++) {
            int noOfZeros = 0;
            int noOfOnes = 0;

            for (int j = 0; j < n; j++) {
                if (grid[j][i] == 0) {
                    noOfZeros++;
                } else {
                    noOfOnes++;
                }
            }

            if (noOfOnes < noOfZeros) {
                for (int j = 0; j < n; j++) {
                    grid[j][i] = grid[j][i] == 0 ? 1 : 0;
                }
            }
        }

        // calculate score
        int Score = 0;

        for (int i = 0; i < n; i++) {
            int x = 1;
            for (int j = m - 1; j >= 0; j--) {
                Score += grid[i][j] * x;
                x *= 2;
            }
        }

        return Score;
    }
}
