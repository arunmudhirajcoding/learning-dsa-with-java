import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    //input =    val[] = {60,100,120};
        //  weight[] = {10, 20, 30};
        //  w = 50; max capacity of knapsack(bag)

    //output maxvalue with max capacity
    //min weight first added so that max items included into bag for max value
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10, 20, 30};
        int w = 50; 

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];//fractional value of weights

        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));//sort(ascending order) for max value

        int capacity = w;
        int finalVal = 0;
        for (int i = ratio.length-1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) { //if the current weight is less then only value is added
                finalVal +=val[idx]; // result added with min weighted's value
                capacity -= weight[idx];//remaining weight after min weight added into bag

            } else {//if current wight is more then calculate the value of per weight then multiple with remaining weight 

                finalVal += (ratio[i][ 1] * capacity);//( ((value/weight)*remaining weight)=120/30 = 4rs per weight * 20 weight remaining = (80rs per 20 weight) )
                capacity = 0; //last frational left means filled with max capacity
                break;
            }
        }
        System.out.println(finalVal);
    }
}
