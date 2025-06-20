

public class Zig_Zag{

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

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        // size++;
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
        // size++;
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


    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;// modified for even ll

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// mid

    }

    public void zz(){
        Node mid = getMid(head);

        //reverese
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextl,NextR;

        while (left != null && right != null ) {
            nextl = left.next;
            left.next = right;
            NextR = right.next;
            right.next = nextl;

            left = nextl;
            right = NextR;
        }

    }

    public static void main(String[] args) {
        Zig_Zag ll = new Zig_Zag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.traversel();
        ll.zz();
        ll.traversel();
    }
}