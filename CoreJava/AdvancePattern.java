// Butterfly Pattern Printing 23-JAN-2026 JABALPUR
import java.util.Scanner;

public class AdvancePattern
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Integer for Butterfly print :  ");
        
        int a = scanner.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*a - i*2);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*a - i*2);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}