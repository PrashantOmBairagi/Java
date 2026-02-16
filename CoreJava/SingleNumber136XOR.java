package CoreJava;

public class SingleNumber136XOR {
    public static int singleNumber(int[] arr) {
        int result = 0;

        for (int ele : arr){
            result = result^ele;
        }

        return result;
    }
    static void main() {
        int[] arr = {4, 4,5,1, 2, 1, 2};
        System.out.println(singleNumber(arr));
    }
}
