package CoreJava;

import java.util.Scanner;

public class RecursionPowerAB {
    public static int power(int a,int b){
        if(b==0) return 1;
        return a * power(a,b-1);
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
