
public class reverseList {
    public class Node {
        Node next;
        int val;

        Node(int data) {
            this.val = data;
            this.next = null;
        }
    }

    public static Node head;
    public static int size;

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;
        // if no node
        if (head == null) {
            head = newNode;
            return;
        }
        // newNode point to exist node
        newNode.next = head;

        // head will transfer to newNode
        head = newNode;

    }

    public static void reverse() {

    }

    public static void traversel() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ");
        }
    }

    public static void main(String[] args) {
        reverseList ll = new reverseList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        // ll.reverse();
        ll.traversel();

    }
}
