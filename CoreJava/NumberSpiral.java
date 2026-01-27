//27-JAN-2026 Printing advance pattern to gain Hands on Muscle memory for JAVA.
package CoreJava;
import java.util.Scanner;
class PrintSpiral{
    void Spiral(int n){

        for (int i = 1; i<=n;i++){
            int K = n;
            for(int j=1;j<=i;j++){
                System.out.print(K+ " ");
                K--;
            }
            K = n-i+1;
            for(int j=1;j<=n-i;j++){
                System.out.print(K+ " ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(K+ " ");
            }
            K=n-i+1;
            for(int j=1;j<=i;j++){
                System.out.print(K+ " ");
                K++;
            }

            System.out.println();
        }
        for (int i =n; i>=1;i--){
            int K = n;
            for(int j=1;j<=i;j++){
                System.out.print(K+ " ");
                K--;
            }
            K = n-i+1;
            for(int j=1;j<=n-i;j++){
                System.out.print(K+ " ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(K+ " ");
            }
            K=n-i+1;
            for(int j=1;j<=i;j++){
                System.out.print(K+ " ");
                K++;
            }

            System.out.println();
        }



    }
}
public class NumberSpiral {
    static void main() {
        System.out.print("Enter Number for which you want spiral: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintSpiral printSpiral = new PrintSpiral();
        printSpiral.Spiral(n);

        System.out.println();
        System.out.print("Manage you terminals Ratio to See Pattern properly.");
    }
}
