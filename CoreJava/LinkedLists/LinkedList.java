package CoreJava.LinkedLists;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

}

public class LinkedList {
    static void main() {
/*
        Node head=new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);

        head.next=b;
        b.next=c;
*/

        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
    }

}
