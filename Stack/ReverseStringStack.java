package Stack;

import java.util.Stack;

public class ReverseStringStack {
    public static Stack<String> reverseStringStack(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }
        Stack<String> result=new Stack<>();
        while(!st.isEmpty()){
            result.push(st.pop()+"");
        }
        return result;
    }
    public static void main(String[] args) {
        String str="hello";
        Stack<String> result=reverseStringStack(str);
        System.out.println(result);
    }
}
