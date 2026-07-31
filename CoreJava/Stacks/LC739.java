package CoreJava.Stacks;
import java.util.Stack;

public class LC739 {
    static void main() {
        int[] arr = new int[]{73,74,75,71,69,72,76,73};
        for(int ele : dailyTemperatures(arr)){
            System.out.print(ele+" ");
        }
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<n; i++){

            while( !stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex ;
            }
            stack.push(i);
        }
        return result;
    }
}
