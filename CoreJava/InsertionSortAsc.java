package CoreJava;

public class InsertionSortAsc {
    static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void main() {
        int[] arr = {4,3,1,7,6,5,2,8};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i; j >=1 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else break;
            }


        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
