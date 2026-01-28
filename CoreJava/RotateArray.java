package CoreJava;
public class RotateArray {

    static void main() {

        int[] arr = {1,2,3,4,5,6,7};
        for (int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        rotate(arr,3);
        for (int ele : arr){
            System.out.print(ele+ " ");
        }
    }
    public static void rotate(int[] arr, int n) {
        int l = arr.length;
        n %= l;
        reverse(arr, 0, l - 1);
        for (int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        reverse(arr, 0, n - 1);
        for (int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        reverse(arr, n, l - 1);

    }
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }


}
