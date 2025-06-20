public class CircularLL {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class CircularSingleLL {
        Node head;
        Node tail;
        int size;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                tail.next = head;
                return;
            }
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                tail.next = head;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        public void traversel() {
            if (head == null) {
                System.out.println("Empty");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + "->");
                temp = temp.next;
            } while (temp != head);
            System.out.println("null");
        }
    }

    static class CircularDoubleLL {
        Node head;
        Node tail;
        Node prev;
        int size;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                head.prev = tail;
                tail.next = head;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            head = newNode;
        }

        public void Last(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                head.prev = tail;
                tail.next = head;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        public void traversel() {
            if (head == null) {
                System.out.println("Empty");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            } while (temp != head);
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        CircularSingleLL singleCircularList = new CircularSingleLL();
        singleCircularList.addFirst(10);
        singleCircularList.addFirst(20);
        singleCircularList.addLast(30);
        singleCircularList.addLast(40);
        singleCircularList.traversel();

        DoubleLL doubleCircularList = new DoubleLL();
        doubleCircularList.addFirst(50);
        doubleCircularList.addFirst(60);
        
        doubleCircularList.traversel();

    }
}
