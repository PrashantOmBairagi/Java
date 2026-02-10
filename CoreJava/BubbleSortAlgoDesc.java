package CoreJava;

public class BubbleSortAlgoDesc {
    static boolean sortedOrNot(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i + 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
    static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void main() {
        int[]arr = {4,3,1,7,6,5,2,8};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j+1]>arr[j]) swap(arr,j,j+1);
            }
           if (sortedOrNot(arr)) break;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
