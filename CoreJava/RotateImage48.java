package CoreJava;

public class RotateImage48 {
    public static void reverse(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }

        }

    }
    public static void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

        }
    }
    static void main() {
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        transpose(matrix);
        reverse(matrix);
        for (int[] mt : matrix){
            for (int ele: mt){
                System.out.print(ele+ "  ");
            }System.out.println();
        }


    }
}
