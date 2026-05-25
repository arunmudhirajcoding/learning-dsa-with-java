import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {

    // india coins:
    // inputs coins[] = {1,2,5,10,20,50,100,500,2000} and value = 590

    // ouput = min no. of coins to make v (590 = 500+50+20+20) count = 4
    // greedy: take max coin first

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int value = 590;
        Arrays.sort(coins, Comparator.reverseOrder());// sort to get max coin first

        ArrayList<Integer> ans = new ArrayList<>();
        int countofCoins = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= value) {
                while (coins[i] <= value) {
                    countofCoins++;
                    ans.add(coins[i]);
                    value -= coins[i];
                }
            }
        }
        System.out.println("total (min) coins used = "+countofCoins);
        System.out.println(ans);
    }
}
