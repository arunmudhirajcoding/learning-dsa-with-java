import java.util.LinkedList;

public class LLmergeSort {

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

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next; //next bcoz head is -1 
    }

    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right Ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

    public static void main(String[] args) {
        LLmergeSort ll = new LLmergeSort();
        ll.addFirst(1);
        ll.addFirst(6);
        ll.addFirst(3);
        ll.addFirst(0);
        ll.addFirst(5);

        ll.traversel();
        ll.head = ll.mergeSort(ll.head);
        ll.traversel();
        
    }
}
