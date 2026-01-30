// 28-JAN-2026 Doing Number Spiral type two , basically only 1 number is in between.
package CoreJava;
import java.util.Scanner;

class PrintSpiral2{
    void Spiral(int n){
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print((j>i)?(n-i+ "  "):(n-j + "  "));
            }
            for (int j=n-1;j>1;j--){
                System.out.print((n-(Math.min(i,j))+ "  "));
            }

            System.out.println();
        }
        //4thloop
//            for (int j=0;j<n;j++){
//                System.out.print((j<i)?(i+ "  "):(j + "  "));
//            }
    }
}

public class NumberSpiral2 {
    static void main() {
        System.out.print("Enter Number for which you want spiral: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintSpiral2 printSpiral2 = new PrintSpiral2();
        printSpiral2.Spiral(n);

        System.out.println();
        System.out.print("Manage you terminals Ratio to See Pattern properly.");
    }
}
