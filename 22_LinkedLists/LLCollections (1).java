import java.util.LinkedList;
public class LLCollections {

    //in java we have java collection framework
    //where all datastructures like arrays, ll, hash,stack,queue are inbuilt with their methods also
    
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addFirst(2);
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
