package CoreJava.LinkedLists;

import java.util.Scanner;



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        this.val = x;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedListsLC21 {

    public static void display(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<list2.val){
            list1.next = mergeTwoLists2(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeTwoLists2(list1,list2.next);
            return list2;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode list3 =new ListNode(-1);
        ListNode l3head = list3;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                l3head.next=list1;
                list1=list1.next;
            }
            else{
                l3head.next=list2;
                list2=list2.next;
            }
            l3head=l3head.next;

        }
        if(list1!=null){
            l3head.next=list1;
            l3head=l3head.next;
        }
        if(list2!=null){
            l3head.next=list2;
            l3head=l3head.next;
        }
        return list3.next;
    }

        public void main(){
        ListNode List1=new ListNode(1);
        List1.next=new ListNode(2);
        List1.next.next=new ListNode(4);
        ListNode List2=new ListNode(1);
        List2.next=new ListNode(3);
        List2.next.next=new ListNode(4);



        //display(mergeTwoLists(List1, List2));

        display(mergeTwoLists2(List1, List2));

    }
}
