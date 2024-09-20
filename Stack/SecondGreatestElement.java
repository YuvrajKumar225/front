package Stack;

import java.util.HashMap;
import java.util.Stack;

public class SecondGreatestElement {
    public static HashMap<Integer, Integer> secondGreatestElement(int arr[]) {
        HashMap<Integer, Integer> result = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            
            if (st.isEmpty()) {
                result.put(arr[i], -1);
            } else {
                result.put(arr[i], st.peek());
            }
            
            st.push(arr[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 25 };
        HashMap<Integer, Integer> map = secondGreatestElement(arr);
        System.out.println(map);
    }
}
