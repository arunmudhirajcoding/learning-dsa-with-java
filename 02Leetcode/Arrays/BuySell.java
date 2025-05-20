public class BuySell {
    // tc=O(n)
    public static int MaxProfit(int prices[]){
        int maxProfit=0;
        int profit=0;
        int BuyPrice= prices[0];
        for (int i = 1; i < prices.length; i++) {
            //if stock price is high we sell and get profit
            if (prices[i]>BuyPrice) {
             profit = prices[i]-BuyPrice;
             maxProfit=Math.max(maxProfit, profit);   
            } else {
                // if stock price is low we buy 
                BuyPrice=prices[i];
            }  
        }
        // System.out.println();
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 6, 4, 3, 1};
        int Mp=MaxProfit(prices);
        System.out.println("the maximum profit is "+Mp);
    }
}
