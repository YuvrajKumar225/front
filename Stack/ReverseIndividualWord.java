package Stack;

import java.util.Stack;

public class ReverseIndividualWord {

    public static String reverseIndividualWord(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            Stack<Character> st = new Stack<>();
            String word = words[i];

            // Push characters onto the stack
            for (char ch : word.toCharArray()) {
                st.push(ch);
            }

            // Pop characters from the stack to reverse the word
            while (!st.isEmpty()) {
                result.append(st.pop());
            }

            // Add space between words, except for the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        String ans = reverseIndividualWord(str);
        System.out.println(ans);
    }
}
