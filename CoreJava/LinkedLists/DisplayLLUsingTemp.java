package CoreJava.LinkedLists;

import java.util.Scanner;

public class DisplayLLUsingTemp {

    public static void printLL(Node head){
        if (head==null) return;
        System.out.println(head.data);
        printLL(head.next);
    }
    public static Node inputLL(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data==-1) return null;
        Node head = new Node(data);
        head.next = inputLL();
        return head;
    }
    static void main() {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        Node head1 = inputLL();



//        Node temp=head;

//        int size=0;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//            size++;
//        }
//        System.out.println("LL Size : " + size);

        //Using Recursion:
        printLL(head1);
    }
}
