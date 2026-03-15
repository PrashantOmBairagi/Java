package CoreJava.LinkedLists;

public class MergeInBWLinkedList1669 {

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode prevA = list1;


        for (int i = 0; i < a - 1; i++) {
            prevA = prevA.next;
        }

        ListNode afterB = prevA;

        for (int i = 0; i < b - a + 2; i++) {
            afterB = afterB.next;
        }


        prevA.next = list2;

        ListNode tail = list2;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = afterB;

        return list1;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void main() {

        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next = new ListNode(5);

        ListNode list2 = new ListNode(100);
        list2.next = new ListNode(101);
        list2.next.next = new ListNode(102);

        int a = 3;
        int b = 4;

        ListNode result = mergeInBetween(list1, a, b, list2);

        printList(result);

    }
}
