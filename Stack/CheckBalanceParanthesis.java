package Stack;

import java.util.Stack;

public class CheckBalanceParanthesis {
    public static boolean checkBalanceParanthesis(String str) {
        if (str == null) {
            return true;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.add(ch);
            }
            else if (ch == ')' || ch == '}'|| ch == ']') {
                if (st.isEmpty()) {
                    return false;
                }
            }
            char top=st.peek();
            if (ch == ')' && top=='(' || ch == '}'&& top=='{' || ch == ']'&& top=='[') {
                st.pop();
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "(()())";
        boolean ans = checkBalanceParanthesis(str);
        System.out.println(ans);
    }
}
