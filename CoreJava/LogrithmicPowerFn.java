package CoreJava;

import java.util.Scanner;

public class LogrithmicPowerFn {
    public static int power(int a,int b){
        if(b==0) return 1;
        if(b==1) return a;
        int ans = power(a,b/2);
        if(b%2==0) return ans*ans;
        else return  ans*ans*a;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and power respectively : ");
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(power(a,b));
    }
}
