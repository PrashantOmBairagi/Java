package CoreJava;

public class SearchInRotatedArrayUsingBS {
    static void main() {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int l=0,h=arr.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]==target){
                System.out.println(m);
            }
            if(arr[l]<=arr[m]){
                if(arr[l]<=target&&target<arr[m]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(arr[m]<target&&target<=arr[h]){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
        }
    }

}
