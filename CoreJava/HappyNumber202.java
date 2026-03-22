package CoreJava;

public class HappyNumber202 {
    /// Floyds Cycle detection algo : Rememember This Bairagi!
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }
    static int getNext(int n){
        int sum = 0;
        while (n != 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n/10;
        }
        return sum;
    }

    /// M-II [4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4] Exploit unhappy Loop.
    public static boolean isHappy2(int n) {
        while(n != 1 && n != 4){
            int sum = 0;
            while(n != 0){
                int digit = n%10;
                sum += digit * digit;
                n/=10;
            }
            n = sum;
        }
        return n == 1;
    }

    static void main() {
        int n = 19;
        System.out.println(isHappy(n));
        System.out.println(isHappy2(n));
    }
}
