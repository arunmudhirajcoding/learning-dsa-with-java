package LinkedLists;
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // step2 methods
    // create & addFirst tc=O(1)
    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        // if no node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // newNode point to exist node
        newNode.next = head;

        // head will transfer to newNode
        head = newNode;

    }

    // addLast-tc=(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        // when initilize the newnode. by default it is created by a data and null 
        // newNode.next = null;

        tail.next = newNode;
        tail = newNode;
    }

    //traversel
    public void traversel(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        // step1
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        // ll.traversel();
    }
}
