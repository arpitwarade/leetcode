class Solution {
    public boolean helper(int[] nums, int mid, int t){
        int count = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] <= mid){
                count++;
            }
            else{
                count += nums[i]/mid;
                if(nums[i]%mid != 0){
                    count++;
                }
            }
        }
        if(count <= t){
            return true;
        }
        else{
            return false;
        }
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high  =  Integer.MIN_VALUE;
         for(int i : nums){
            high = Math.max(high,i);
         }
         int res = -1;

         while(low <= high){
            int mid = (low +high)/2;

            if(helper(nums, mid, threshold)){
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