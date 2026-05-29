import java.util.PriorityQueue;

public class SlidingWindowMax {
    // this problem can done With dequeue in tc= O(n)-> optimum
    // using heaps tc=O(nlogn)
    // depend on contrains use any one 


    static class Pair implements Comparable<Pair> {
    
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            //ascending
            // return this.val - p2.val;

            //descending
            return p2.val - this.val;
        }
    }
    
    public static void main(String[] args) { // O(nlogk)
        PriorityQueue<Pair> window = new PriorityQueue<>(); // maxHeap

        int arr[] = {1,3,-1,-3,5,3,6,7};
        
        int k = 3; // window size
        int n = 8; // no. of elements

        int[] res = new int[n-k+1];

        //1st window
        for (int i = 0; i < k; i++) {
            window.add(new Pair(arr[i], i));
        }

        //max val
        res[0] = window.peek().val;

        // 1st window of k size val taken means looping from next ele after k size 
        for (int i = k; i < arr.length; i++) {

            // if max ele idx in queue is less than curr window (i-k) then remove it
            while (window.size() > 0 && window.peek().idx <= (i-k)) {
                window.remove();
            }

            // push curr window ele 
            window.add(new Pair(arr[i], i));
            // added max val
            res[i-k+1] = window.peek().val;
        }   
        
    }
}
