package CoreJava;

public class BalancedString1221 {
    public static int balancedStringSplit(String s) {
        int balancer = 0;
        int returnCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') balancer++;
            else balancer--;

            if(balancer==0) returnCount++;

        }
        return returnCount;
    }

    static void main() {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
