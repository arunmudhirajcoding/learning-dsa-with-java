import java.util.Deque;
import java.util.LinkedList;

public class DequeQueue {

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void enque(int data) {
            deque.addLast(data);
        }

        public int dequeue() {
            return deque.removeFirst();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}
