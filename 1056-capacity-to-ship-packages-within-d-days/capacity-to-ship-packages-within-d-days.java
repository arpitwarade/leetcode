class Solution {
    public boolean helper(int [] weights, int days, int mid){
        int weight = 0;
        int shipDays = 1;
        for(int i = 0; i<weights.length; i++){
            
            if(weight+weights[i] > mid ){
                weight = 0;
                shipDays++;
            }
            weight += weights[i];
        }
        return shipDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        int res = -1;
        for(int w : weights){
            low= Math.max(low, w);
            high += w;
        }
        while(low<= high){
            int mid = (high+low)/2;
            if(helper(weights,days,mid)){
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