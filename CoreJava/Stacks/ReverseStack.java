package CoreJava.Stacks;

import java.util.Stack;

public class ReverseStack {
    static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int temp=st.pop();
        reverse(st);
        System.out.println(temp);
    }
    static void printStack(Stack<Integer> st){
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    static void main() {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        //printStack(st);
        reverse(st);


    }
}
