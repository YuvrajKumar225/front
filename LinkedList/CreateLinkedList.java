package LinkedList;

public class CreateLinkedList {
    private static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
    static Node head;
    static Node tail;
    static int size=0;

    public static void insertAtindex(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size-1){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        Node node=new Node(val, temp.next);
        temp.next=node;
        size++;
    }
    public static void insertLast(int val){
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        if(tail==null){
            insertFirst(val);
            return;
        }
        size=size+1;
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
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args) {
        System.out.println(head);
        insertFirst(1);
        insertFirst(2);
        insertLast(3);
        insertLast(4);
        display();
        insertAtindex(5, 2);
        display();
        System.out.println(size);
    }
}
