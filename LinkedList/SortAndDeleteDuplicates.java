package LinkedList;

public class SortAndDeleteDuplicates {
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

    public static void sortAndDeleteDuplicates(Node head) {
        if (head == null || head.next == null) {
            return ;
        }
        Node current=head;
        while(current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
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
        SortAndDeleteDuplicates list1 = new SortAndDeleteDuplicates();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(2);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(5);
        list1.insertFirst(5);
        list1.insertFirst(6);
        list1.display();
        sortAndDeleteDuplicates(list1.head);
        list1.display();
    }
}
