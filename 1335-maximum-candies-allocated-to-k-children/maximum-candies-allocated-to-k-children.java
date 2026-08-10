class Solution {
    public boolean helper(int []candies, long k, long mid){
        long count = 0;
        for(int i =0; i<candies.length; i++){
            count  = count + candies[i]/mid;
            if(count >= k){
                return true;
            }
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        long low= 1;
        long high = Long.MIN_VALUE;
        int n = candies.length;
        for(long c : candies){
            high = Math.max(high, c);
        }
        long res = 0;
        while(low <= high){
            long mid = (low+high)/2;
            if(helper(candies, k, mid)){
                res = mid;
                low = mid+1;
                
            }
            else{
                high = mid-1;
            }
        }
        return (int)res;
    }
}