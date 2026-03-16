package CoreJava.LinkedLists;

class LinkedLists{
    static Node head;
    static Node tail;
    static int size;
    static void addAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = tail.next;
        }
        size++;
    }
    static void addAtStart(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    int size(){
        return size;
    }
    static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class LinkedListImplementation {

    static void main() {
        LinkedLists.addAtEnd(24);
        LinkedLists.addAtEnd(25);
        LinkedLists.addAtEnd(26);
        System.out.println("Size = " + LinkedLists.size);
        LinkedLists.print();
        LinkedLists.addAtStart(10);
        LinkedLists.addAtStart(7);
        LinkedLists.addAtStart(8);

        System.out.println("Size = " +LinkedLists.size);
        LinkedLists.print();


    }

}
