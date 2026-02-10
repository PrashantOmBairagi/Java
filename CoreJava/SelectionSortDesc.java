package CoreJava;

public class SelectionSortDesc {
    static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void main() {
     int[] arr = {4,3,1,7,6,5,2,8};
        int n = arr.length;


        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int maxndex = -1;
            for (int j = i; j < n ; j++) {
                if(arr[j]>max) {
                    max = arr[j];
                    maxndex = j;
                }
            }
            swap(arr,i,maxndex);
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
