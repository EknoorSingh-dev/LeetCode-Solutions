public class 121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
       for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=prices[i];
        }

        int profit=prices[i]-min;

        if(profit>max)
        max=profit;
       }
       return max;
    }
}
