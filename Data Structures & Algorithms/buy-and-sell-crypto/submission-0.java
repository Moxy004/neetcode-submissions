class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int maxProfit = 0;

        for(int x = 0; x < prices.length; x++){
            if(prices[x] < lowest){
                lowest = prices[x];
            }

            int profit = prices[x] - lowest;

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
