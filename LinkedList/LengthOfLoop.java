package LinkedList;

public class LengthOfLoop {
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

    Node head;
    static int size = 0;

    public  static int calculateLength(Node head){
        Node temp1=head;
        Node temp2=head;
        int count=0;
        while(temp2.next!=temp1){
            temp2=temp2.next;
            count++;
        }
        return count+1;
    }

    public static int  lengthOfLoop(Node head) {
        if (head == null || head.next == null) {
            return -1;
        }
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return  calculateLength(slow);
            }
        }
        return -1;
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
        Node first = new Node(1);
        Node second = new Node(2);
        first.next = second;
        Node third = new Node(3);
        second.next = third;
        Node fourth = new Node(4);
        third.next = fourth;
        Node fifth = new Node(5);
        fourth.next = fifth;
        fifth.next = third;
        System.out.println(lengthOfLoop(first));
    }
}
