class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice =Integer.MAX_VALUE;
        int Profit =0;
        for(int i = 0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int currProfit = prices[i]-buyPrice;
                Profit = Math.max(Profit, currProfit);
            }else{
                buyPrice = prices[i];
            }
        }
        return Profit;
    }
}