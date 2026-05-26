import java.util.ArrayList;

public class ArraylistImple {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        public void add(int val) {
            arr.add(val);

            int x = arr.indexOf(val); // last index
            int par = (x - 1) / 2;


            // its not neccessery to be sorted but follow heap properties
            while (arr.get(x) < arr.get(par)) { //for minHeap just reverse the sign
                // System.out.println(x + " " + par);
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // changing index for futhure check
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) { //just revser the compare sign for minHeap
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {//just revser the compare sign for minHeap
                minIdx = right;
            }

            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        
        public int remove(){
            int data = arr.get(0);

            // step-1 swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step-2 delete last
            arr.remove(arr.size()-1);

            // step-3 heapify
            heapify(0); // o(logn)
            return data;

        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }


    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(10);
        System.out.println(hp.arr);
        hp.add(20);
        System.out.println(hp.arr);
        hp.add(30);
        System.out.println(hp.arr);
        hp.add(40);
        System.out.println(hp.arr);
        hp.add(50);
        System.out.println(hp.arr);
        hp.add(5);
        System.out.println(hp.arr); 
        System.out.println(hp.peek());

        System.out.println(hp.remove());
        System.out.println(hp.arr);


        // printing heap
        System.out.println("========printing heap============");
        while (!hp.isEmpty()) {
            System.out.print(hp.peek()+" ");
            hp.remove();
        }

    }
}
