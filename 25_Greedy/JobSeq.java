import java.util.ArrayList;
import java.util.Collections;

public class JobSeq {
    static class job {

        int deadline;
        int profit;
        int id;

        public job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        // job sequencing:
        // inputs:jobinfo[][] = {{4(deadline time ),20(profit)},{1,10}, {1,40}, {1,30}}
        // output: collect maximum profit where each job done once at a time
        // greedy : max profit first with min deadline

        int jobsInfo[][] =  {{4,20},{1,10}, {1,40}, {1,30}};

        ArrayList<job> jobs = new ArrayList<>();//convert into collection with job class

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new job(i, jobsInfo[i][0], 
            jobsInfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2 )->obj2.profit-obj1.profit);//lambda func for profit decreasing order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);
            if (curr.deadline>time) {
                seq.add(curr.id);
                time++;
            }
        }
        
        System.out.println("max jobs = "+seq.size());
        System.out.println(seq);
    }
}
