class Solution {
    public boolean helper(int []bloomDay, int m, int k, int mid){
        int flowers = 0;
        int boquets =0;
        for(int i =0; i<bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                flowers++;
                if(flowers == k){
                    boquets++;
                    flowers =0;
                }
            }
            else{
                flowers =0;
            }
        }
        return boquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low =Integer.MAX_VALUE;
        int high =Integer.MIN_VALUE;
        for(int day : bloomDay){
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        int res = -1;
        while(low<= high){
            int mid = (low+high)/2;
            if(helper(bloomDay,m,k,mid)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
                
            }
        } 
        return res;
    }
}