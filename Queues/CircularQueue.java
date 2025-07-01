
public class CircularQueue {
    static class queue {

        static int arr[];
        static int front;
        static int rear;
        static int size;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add tc= O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove tc= O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            int res = arr[front];

            return res;
        }

        // peek tc= O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empt queue");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        queue q = new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
