package CoreJava;

public class SpiralMatrixPrint {
    static void main() {
       //int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
//        for (int[] mt:arr){
//            for (int ele: mt)
//                System.out.print(ele+"  ");
//            System.out.println();
//        }
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length-1;
        int maxCol = arr[0].length-1;

        while(maxRow>0 || maxCol>0){

            for (int i = minCol; i <= maxCol ; i++) {
                System.out.print(arr[minRow][i]+ " ");
            }minRow++;

            for (int i = minRow; i <= maxRow ; i++) {
                System.out.print(arr[i][maxCol]+ " ");
            }maxCol--;

            for (int i = maxCol; i>= minCol ; i--) {
                System.out.print(arr[maxRow][i]+ " ");
            }maxRow--;

            for (int i = maxRow; i >= minRow ; i--) {
                System.out.print(arr[i][minCol]+ " ");
            } minCol++;


        }

    }
}
