package LinkedList;

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
    public static int size;

    // step2 methods
    // create & addFirst tc=O(1)
    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // when initilize the newnode. by default it is created by a data and null
        // newNode.next = null;

        tail.next = newNode;
        tail = newNode;
    }

    // traversel
    public void traversel() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // add at index - tc=(n) to search the index
    public void add(int data, int idx) {

        if (idx == 0) {
            System.out.println("inserted successfully");

            addFirst(data);
            return;
        }
        if (head == null) {
            System.out.println("ll does exist");
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if ((i + 1) == idx) {
                newNode.next = temp.next;
                temp.next = newNode;
                System.out.println("inserted successfully");
                return;
            }
            i++;
            temp = temp.next;
        }
        System.out.println("idx overflow");

    }

    // remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
        // garbage collector automatically deletes the removed node. bcoz now it cant
        // reach so not used again
    }

    // remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev: i = size-2
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail=prev;
        size--;
        return val;
    }

    //search(iterative)
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while (temp!=null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    
    public int helper(Node head,int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0 ;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    //search(Recursive)
    public int recSearch(int key){
        return helper(head,key);
    }

    public static void main(String[] args) {
        // step1
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(5, 0);
        ll.traversel();

        System.out.println(ll.size);// tc=O(1)
    }
}
