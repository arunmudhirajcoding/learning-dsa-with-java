import java.util.PriorityQueue;

public class ConnNRopes {

    /*
    Connect N Ropes

    given are N ropes of different lengths, the task is to connnect these ropes into one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
    */
    
    //  2 + 3 + 3+4+6
    /*
    only small ropes added : 2 + 3 = 5 + 3 = 8 + 4 = 12 + 6 = 18, 5 + 8 + 12 + 18 = cost = 43 (greedy )

    but creating small ropes : 2+ 3 = 5 , 3 + 4 = 7, 5 + 6 = 11, 7 + 11 = 18  , 5 + 7 + 11 + 18 = cost = 41 (heap)
    */
    
    public static void main(String[] args) {

        int ropes[] = {2, 3, 3, 4, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;

        while (pq.size() > 1) {
            // take min rope-1
            int min = pq.remove();

            // take min rope-2
            int min2 = pq.remove();

            cost+= min + min2;

            // inset the cost (new rope)
            pq.add(min + min2);
        }
        
        System.out.println("cost of connecting n ropes " + cost);
    }
}
