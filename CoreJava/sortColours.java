//29-JAN-2026  DUTCH FLAG METHOD or say it three pointer method. it is famous for arranging 3 colours;

package CoreJava;
public class sortColours {

    static void main() {
        int[] arr = {2,1,0,2,2,1,0,0,2,1,0,0,1};
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        int low=0;
        int mid=0;
        int high= arr.length-1;
        while (mid<=high){
            if(arr[mid] == 0){
                swap(arr,low++,mid++);
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr,high--,mid);
            }
        }
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

     public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
