package CoreJava.LinkedLists;

public class ReverseLinkedList206 {
    public static Node reverseList(Node head){
        Node curr =head;
        Node pre=null;
        while (curr!=null){
            Node nextTemp = curr.next;

            curr.next = pre;

            pre = curr;
            curr = nextTemp;
        }
        return pre;
    }
    static void main() {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        //DisplayLLUsingTemp.printLL(head);

        DisplayLLUsingTemp.printLL(reverseList(head));

    }
}
