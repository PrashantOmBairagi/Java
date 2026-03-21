package CoreJava.LinkedLists;

public class PalindromeLinkedList234 {
     static boolean isPalindrome(ListNode head) {
         if(head == null || head.next == null) return true;

         ListNode revList = new ListNode(head.val);
         ListNode temp1 = head.next;
         while(temp1 != null){
             ListNode newNode = new ListNode(temp1.val);
             newNode.next = revList;
             revList = newNode;
             temp1 = temp1.next;
         }
         temp1 = head;

         while(revList != null){
             if(revList.val != temp1.val) return false;
             revList = revList.next;
             temp1 = temp1.next;
         }

         return true;
     }

    static void main() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next = new ListNode(1);

        //printList(head);
        System.out.println(isPalindrome(head));
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

}
