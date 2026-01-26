//26-JAN-2026 This is my first time switching to IntelliJ IDEA, i have never been anywhere other than VS Code. Today im using since most companies use IntelliJ ide for production and it is full fledged JAVA IDE. Todays topic is Composite pattern(JAVA Basics).
package CoreJava;
import java.util.Scanner;
public class CompositePattern{
    static void main(String[] args) {
        System.out.println("Hi, How many lines would you want to be printed: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        for (int i =0; i<n;i++){
            for(int j=n-1;j>i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((i+j+1)+" ");
            }
            System.out.println();
        }
    }
}
