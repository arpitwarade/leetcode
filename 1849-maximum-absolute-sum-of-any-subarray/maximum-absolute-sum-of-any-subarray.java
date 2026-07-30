class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if(nums.length == 1){
            return Math.abs(nums[0]);
        }      
        int ans = nums[0];
        int maxsum = nums[0];
        int minsum = nums[0];
        for(int i =1; i< nums.length; i++){
            int v1 = maxsum+nums[i];
            int v2 = minsum +nums[i];
            int v3 = nums[i];
            maxsum = Math.max(v1, v3);
            minsum = Math.min(v2,v3);
            ans = Math.max(ans,Math.max(Math.abs(maxsum),Math.abs(minsum)));
        }
        return ans;
  
        
    }
}