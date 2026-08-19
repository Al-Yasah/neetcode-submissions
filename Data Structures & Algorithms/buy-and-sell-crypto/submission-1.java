class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = Integer.MIN_VALUE;
        int profit =0;
        for (int i=0; i<prices.length; i++){
            if (prices[i]<buyPrice){
                buyPrice = prices[i];
            }

            if (prices[i]-buyPrice > profit){
                sellPrice = prices[i];
                profit = sellPrice - buyPrice;
            }
        }

        return profit;



    }
}
