package CoreJava.LinkedLists;

public class ReverseKGroup25 {

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;

        while (true) {
            ListNode kth = getKthNode(groupPrev, k);
            if (kth == null) break;

            ListNode groupNext = kth.next;

            // Reverse group
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Reconnect
            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }

        return dummy.next;
    }

    private static ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    // Utility: create linked list
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Utility: print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = createList(arr1);
        int k1 = 2;

        System.out.println("Example 1:");
        System.out.print("Original: ");
        printList(head1);

        head1 = reverseKGroup(head1, k1);

        System.out.print("Reversed (k=2): ");
        printList(head1);

        System.out.println();

        // Example 2
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        ListNode head2 = createList(arr2);
        int k2 = 3;

        System.out.println("Example 2:");
        System.out.print("Original: ");
        printList(head2);

        head2 = reverseKGroup(head2, k2);

        System.out.print("Reversed (k=3): ");
        printList(head2);
    }
}
