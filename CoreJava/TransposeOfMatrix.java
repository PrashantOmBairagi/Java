package CoreJava;

public class TransposeOfMatrix {
    public static void swap(int[][] mt,int i,int j){
        int temp =  mt[i][j];
        mt[i][j] = mt[j][i];
        mt[j][i] = temp;
    }
    static void main() {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length;
        int n = matrix[0].length;
        for (int[] mt : matrix){
            for (int ele : mt){
                System.out.print(ele+"  ");
            }
            System.out.println();
        }
        //Transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i > j) {
                    swap(matrix, i, j);
                }
            }
        }
        for (int[] mt : matrix){
            for (int ele : mt){
                System.out.print(ele+"  ");
            }
            System.out.println();
        }
    }
}
