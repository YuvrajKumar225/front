package LinkedList;

public class SumOfLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    static Node head;
    static Node tail;
    static int size = 0;

    public static int sumOfLinkedList(){
        Node temp=head;
        int sum=0;
        while(temp!=null){
            sum=sum+temp.val;
            temp=temp.next;
        }
        return sum;
    }
    public static void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size = size + 1;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        insertFirst(1);
        insertFirst(2);
        insertFirst(3);
        insertFirst(4);
        insertFirst(5);
        insertFirst(6);
        insertFirst(7);
        insertFirst(8);
        display();
        System.out.println(sumOfLinkedList());
    }
}
