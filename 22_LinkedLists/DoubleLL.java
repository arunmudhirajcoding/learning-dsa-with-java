public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void traversel() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reversePrint(){
        Node temp = tail;
        while (temp!=null) {
            System.out.print(temp.data+" <=> ");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    public void reverese(){
        Node prev=null;
        Node curr = head;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next=prev;
            curr.prev = next;//new
            prev=curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL dl = new DoubleLL();
        dl.addFirst(1);
        dl.addFirst(2);
        dl.addFirst(3);
        dl.traversel();
        System.out.println(size);
        dl.reversePrint();
        dl.reverese();
        dl.traversel();
    }
}
