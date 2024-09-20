package LinkedList;

public class DeletionOfLinkedList {
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

    public static void deleteFromGivenIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        Node temp=head;
        for(int i=0; i<index-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    public static void deleteLast(){
        Node temp=head;
        for(int i=1; i<size-1; i++){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
    }
    public static void deleteFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    public static void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size=size+1;
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
        System.out.println(size);
        deleteFirst();
        display();
        System.out.println(size);
        deleteLast();
        display();
        System.out.println(size);
        deleteFromGivenIndex(2);
        display();
        System.out.println(size);
    }
}
