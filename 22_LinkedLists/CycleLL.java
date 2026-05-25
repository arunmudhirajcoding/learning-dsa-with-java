
public class CycleLL {
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

    // reversing list-tc=O(n)
    public void reverse() {
        Node prev = null, next, curr = tail = head;// we dont have work with tail so initilize it first
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;// prev wil be last node
    }

    public Node findMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// mid Node
    }

    public static void removeCycle() {// not for ll which 1->2->3->1 head to head cycle
        Node slow = head;
        Node fast = head;
        // detect cycle
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {//detected
                cycle = true;
                slow = head;
                break;
            }
        }
        if (cycle) {
            // remove cycle
            while (slow.next != fast.next) {
                slow = slow.next;// +!
                fast = fast.next;// +1 previous node which need to disconnect
            }
            fast.next = null;//removed
            return;
        } else {
            return;
        }

    }

    public static boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        
        // 1->2->3->2
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // 1->2->3->1
        System.out.println(detectCycle());
        removeCycle();
        System.out.println(detectCycle());
        // System.out.println(detectCycle());
    }
}
