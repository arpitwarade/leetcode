class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int currsum = nums[0];
        int total = nums[0];
        int minsum = nums[0];
        int currminsum = nums[0];
        for(int i = 1; i< nums.length; i++){
            currsum = Math.max(currsum+nums[i], nums[i]);
            currminsum = Math.min(currminsum+nums[i], nums[i]);
            total += nums[i];

            minsum = Math.min(currminsum, minsum);
            maxsum = Math.max(currsum, maxsum);
        }
        if(maxsum < 0){
            return maxsum;
        }
        return Math.max(total-minsum,maxsum);
    }
}