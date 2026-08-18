class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int []prefix = new int[n];
        int []suffix = new int[n];

        int minprice = prices[0];

        for(int i =1; i<prices.length; i++){
            minprice = Math.min(minprice, prices[i]);

            prefix[i] = Math.max(prefix[i-1], prices[i]-minprice);
        } 
        int maxprice = prices[n-1];
        for(int i =n-2; i>=0; i--){
            maxprice = Math.max(maxprice, prices[i]);

            suffix[i] = Math.max(suffix[i+1], maxprice-prices[i]);
        }
        int ans =0;
        for(int i =0; i<prices.length; i++){
            ans = Math.max(ans, prefix[i] + suffix[i]);
        }
        return ans;
    }
}