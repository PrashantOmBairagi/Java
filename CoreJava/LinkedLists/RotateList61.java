
package CoreJava.LinkedLists;
import static CoreJava.LinkedLists.DisplayLLUsingTemp.printLL;

public class RotateList61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int length = 0;
        ListNode tail = head;

        while(tail.next!=null){
            length++;
            tail = tail.next;
        }
        length++;

        k %= length;
        if (k == 0) return head;


        ListNode nodeBeforeCut = head;
        for (int i = 0; i < length - k - 1; i++) {
            nodeBeforeCut = nodeBeforeCut.next;
        }

        ListNode newHead = nodeBeforeCut.next;
        nodeBeforeCut.next = null;

        tail.next = head;


        return newHead;
    }





    static void main() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        ListNode result = rotateRight(head, 2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
