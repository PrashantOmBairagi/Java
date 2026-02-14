package CoreJava;

public class NthStair {
    public static int stair(int n){
        if(n<=1) return 1;
        return stair(n-1)+stair(n-2);
    }
    static void main() {
        int n = 5;
        System.out.println(stair(n));
    }
}
