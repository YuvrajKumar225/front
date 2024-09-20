package Stack;

import java.util.Stack;

public class SortAStack {
    public static Stack<Integer> sortStack(Stack<Integer> input){
        Stack<Integer> tempStack = new Stack<>();
        while(!input.isEmpty()){
            int temp = input.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > temp){
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack: " + stack);
        Stack<Integer> sortedStack = sortStack(stack);
        System.out.println("Sorted Stack: " + sortedStack);
    }
}
