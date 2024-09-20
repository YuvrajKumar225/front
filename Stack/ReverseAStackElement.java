package Stack;

import java.util.Stack;

public class ReverseAStackElement {
    public static Stack<Integer> reverseAStackElement(int arr[]){
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<arr.length; i++){
            st.push(arr[i]);
        }
        Stack<Integer> result=new Stack<>();
        while(!st.isEmpty()){
            result.push(st.pop());
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Stack<Integer> result=reverseAStackElement(arr);
        System.out.println(result);
    }
}
