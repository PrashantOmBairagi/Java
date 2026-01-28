//28-JAN-2026 Array in cpp and java are almost same except their declaration in cpp we write int arr[] whilst in java we write int [] arr;
package CoreJava;
public class SecondLargestEleArray {
    static void main() {
        int[] arr = new int[50];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i=0;i<50;i++){
            arr[i]= (int) (Math.random()*100);
        }
        for(int a:arr){
            if(a>max1) max1=a;
            if((a != max1) && (a > max2)) max2=a;
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
