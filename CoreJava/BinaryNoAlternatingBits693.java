package CoreJava;
import java.util.ArrayList;
//What i learnt is that it could have been solved without arraylist , but i wanted to use arraylist to learn its behaviour in recursion.However it took Log(n) time and space complexity , but Using Bit Manipulation it could have Been much easier and efficient but i haven't learnt Bit Manipulation yet.

public class BinaryNoAlternatingBits693 {
    static void bitCheck(int n,ArrayList<Integer> arr){
        if(n<=0) return ;
        bitCheck(n/2,arr);
        arr.add(n%2);
    }
    public static boolean hasAlternatingBits(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        bitCheck(n,arr);
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i).equals(arr.get(i+1))) return false;
        }
        return true;
    }
    static void main() {
        int n = 5;

        System.out.println(hasAlternatingBits(n));
    }
}
