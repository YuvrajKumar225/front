package LinkedList;

public class FindIntersectionPoint {
    Node head;
    static int size = 0;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private static Node findIntersectionPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node temp1=head1;
        Node temp2=head2;
        while(temp1.next!=null && temp2.next!=null){
            if(temp1.val<temp2.val){
                temp1=temp1.next;
            }
            if(temp2.val<temp1.val){
                temp2=temp2.next;
            }
            if(temp1.val==temp2.val){
                
                return temp1;
            }
        }
        return null;
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

    public void insertAtEnd(int val) {
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
        FindIntersectionPoint list1 = new FindIntersectionPoint();
        list1.insertLast(10);
        list1.insertLast(15);
        list1.insertLast(30);
        list1.display();
        FindIntersectionPoint list2 = new FindIntersectionPoint();
        list2.insertLast(3);
        list2.insertLast(6);
        list2.insertLast(9);
        list2.insertLast(15);
        list2.insertLast(30);
        list2.display();
        Node interSectionPoint = findIntersectionPoint(list1.head, list2.head);
        System.out.println(interSectionPoint.val);
    }
}
