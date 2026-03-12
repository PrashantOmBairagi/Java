package CoreJava.LinkedLists;

import static CoreJava.LinkedLists.DisplayLLUsingTemp.printLL;

public class MiddleOfTheLinkedList876 {
    static Node middleOfLL(Node head){
        Node middle=head;
        int count = 0;
         while(middle != null){
             middle=middle.next;
             count++;
         }
         for(int i=0;i<=count/2;i++){
             if(i == count/2){
                 return head;
             }
             head=head.next;
         }
         return null;
    }
    static void main() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        printLL(middleOfLL(head));
    }
}
