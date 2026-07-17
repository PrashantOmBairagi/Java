import java.util.*;
public class StringMethods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Now input Integer first.");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Now input string.");
        String str = sc.nextLine().trim(); 
     //   char ch =  sc.next().charAt(0);
        System.out.println("The Input are : " + x + " and " + str);
    }
}