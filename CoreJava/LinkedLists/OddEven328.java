package CoreJava.LinkedLists;

import static CoreJava.LinkedLists.LinkedLists.head;

public class OddEven328 {
    public static ListNode oddEvenList(ListNode head){
        ListNode oddDummy = new ListNode(-1);
        ListNode evenDummy = new ListNode(-1);

        ListNode odd = oddDummy;
        ListNode even = evenDummy;
        ListNode temp = head;

        boolean flag = false;

        while(temp!=null){
            if(flag){
                even.next = temp;
                even = even.next;
                flag = false;
            }else {
                odd.next = temp;
                odd = odd.next;
                flag = true;
            }
            temp = temp.next;
        }
        even.next = null;
        odd.next = evenDummy.next;
        return oddDummy.next;
    }

    static void main() {
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(5);
        list1.next.next.next.next = new ListNode(6);
        list1.next.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next.next = new ListNode(7);

        ListNode result = oddEvenList(list1);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        //Input: head = [2,1,3,5,6,4,7]
        //Output: [2,3,6,7,1,5,4]

    }
}
