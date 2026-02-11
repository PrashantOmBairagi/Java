package CoreJava;

public class SquareRoot69 {
    static void main() {
        System.out.print(mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        int lo = 0 ;
        int hi = x;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(mid<=x/mid && (mid+1)>x/(mid+1)) return mid;
            else if(mid< x/mid) lo = mid+1;
            else hi = mid-1;
        }
        return 1;
    }
}
