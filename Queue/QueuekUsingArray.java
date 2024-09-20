package Queue;

public class QueuekUsingArray {
    private final int maxSize;
    private final int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    // Constructor
    public QueuekUsingArray(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
        currentSize = 0;
    }
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        currentSize++;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Or throw an exception
        }
        front = (front + 1) % maxSize;
        int dequeuedValue = queueArray[front];
        currentSize--;
        return dequeuedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Or throw an exception
        }
        int frontIndex = (front + 1) % maxSize;
        return queueArray[frontIndex];
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (currentSize == maxSize);
    }

    // Get the current size of the stack
    public int size() {
        return currentSize;
    }

    // Main method for testing
    public static void main(String[] args) {
        QueuekUsingArray queue = new QueuekUsingArray(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        System.out.println("Is queue full? " + queue.isFull());
    }
}
