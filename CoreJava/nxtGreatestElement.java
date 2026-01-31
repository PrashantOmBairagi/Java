package CoreJava;

public class nxtGreatestElement {
    static void main() {
        int [] arr = {12,8,60,37,2,49,16,28,21};
        int n = arr.length;
        int [] ans = new int[n];
        int mx = -1;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]>mx) {
                ans[i] = mx;
                mx = arr[i];

            }else ans[i] = mx;

        }

        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele: ans) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
