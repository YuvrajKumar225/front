package Stack;

public class StackUsingArray {
    private final  int maxSize;
    private final int[] stackArray;
    private int top;

    // Constructor
    public StackUsingArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push operation to add an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        top++;
        stackArray[top] = value;
    }

    // Pop operation to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Or throw an exception
        }
        int poppedValue = stackArray[top];
        top--;
        return poppedValue;
    }

    // Peek operation to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Or throw an exception
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    // Main method for testing
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println("Is stack full? " + stack.isFull());
    }
}
