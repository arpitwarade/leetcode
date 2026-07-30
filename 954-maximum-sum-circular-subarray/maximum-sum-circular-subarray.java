class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int minsum = nums [0];
        int total = nums[0];

        int minsumend = nums[0];
        int maxsumend = nums[0];
        for(int i = 1; i<nums.length; i++){
            int v1 = maxsumend+nums[i];
            int v2 = nums[i];
            maxsumend =Math.max(v1,v2);
            maxsum =  Math.max(maxsum,maxsumend);
            int v3 = minsumend + nums[i];
            int v4 = nums[i];
            minsumend = Math.min(v3,v4);
            minsum = Math.min(minsum,minsumend);
            total += nums[i];
        }
            if (maxsum < 0) {
                 return maxsum;
            }
        return Math.max(maxsum, total-minsum);
        
    }
}