import java.util.PriorityQueue;

public class WeekestSoldier {

    /*
    We are given an mxn binary matrix of 1's (soliders) and 0's (civilians). The soldiers are positioned in front of the civilians . That is, all the 1's will appear to the left of all the 0's is each row.

    A row i is weaker thaan a row j if one of the folllowing is true:
        The number of soldiers in row i is less than the no. of soldiers in row j.
        Both rows have the same no. of soliders and i<j.
    */
    

    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;

        public Row(int soldiers, int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx; // if soliders are same the i<j (row1 idx < row2)
            } else {
                return this.soldiers - r2.soldiers; // not equal then no. of solider is priority
            }
        }
    }
        
    public static void main(String[] args) {
        int army[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };

        int k = 2; // number of army we need 

        PriorityQueue<Row> pq = new PriorityQueue<>();
        

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count+= army[i][j] == 1 ? 1 : 0; // count No. of Soliders
            }
            pq.add(new Row(count, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("R"+pq.remove().idx);
        }

        
    }
}
