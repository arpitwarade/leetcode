class Solution {
    public boolean helper(int []nums, int k, int mid){
        int capacity =0;
        int kl =1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]+capacity > mid){
                kl++;
                capacity = 0;
            }
            capacity += nums[i];
        }
        return kl <= k;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int n : nums){
            low = Math.max(low, n);
            high += n;
        }
        int res = -1;
        while(low<= high){
            int mid = (high+low)/2;
            if(helper(nums,k,mid)){
                res = mid;
                high = mid-1;
            }
            else{
                low  = mid+1;
            }
        }
        return res;
    }
}