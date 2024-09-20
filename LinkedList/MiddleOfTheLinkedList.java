package LinkedList;

public class MiddleOfTheLinkedList {
    class Node {
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

    Node head;
    Node tail;
    static int size = 0;

    public static Node middleOfTheLinkedList(Node list1) {
        Node slow=list1;
        Node fast=list1;
        System.out.println(size);
        // if(size%2!=0){
        //     int mid=size/2;
        //     for(int i=0; i<mid; i++){
        //         temp=temp.next;
        //     }
        // }
        while(fast.next.next!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return  slow;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size = size + 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        MiddleOfTheLinkedList list1 = new MiddleOfTheLinkedList();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(6);
        Node result=middleOfTheLinkedList(list1.head);
        System.out.println(result.val);
    }
}
