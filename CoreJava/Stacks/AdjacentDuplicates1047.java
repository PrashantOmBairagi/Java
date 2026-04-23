package CoreJava.Stacks;
import java.util.Stack;
//        Leetcode 1047 Remove all Adjacent Duplicates
//         Input: s = "azxxzy"
//         Output: "ay"
public class AdjacentDuplicates1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(st.isEmpty()) st.push(c);
            else if(c == st.peek()) st.pop();
            else st.push(c);
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
    static void main() {

        String s = "aabbac";
        System.out.println(removeDuplicates(s));
    }
}
