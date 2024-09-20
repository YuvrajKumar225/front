package LinkedList;

public class MergeOfLinkedList {
    Node head;
    static int size = 0;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        // Node(int val, Node next) {
        //     this.val = val;
        //     this.next = next;
        // }
    }

    private  static Node mergeLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node temp = new Node(0);
        Node current = temp;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 != null) {
            current.next = head1;
        }
        if (head2 != null) {
            current.next = head2;
        }
        return temp.next;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
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
        MergeOfLinkedList list1 = new MergeOfLinkedList();
        list1.insertLast(5);
        list1.insertLast(10);
        list1.insertLast(15);
        list1.display();
        MergeOfLinkedList list2 = new MergeOfLinkedList();
        list2.insertLast(2);
        list2.insertLast(3);
        list2.insertLast(20);
        list2.display();
        MergeOfLinkedList mergedList = new MergeOfLinkedList();
        mergedList.head = mergeLists(list1.head, list2.head);
        mergedList.display();
    }
}
