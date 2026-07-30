class Solution {
    public int maxProduct(int[] nums) {
        int maximumending = nums[0];
        int minimumending = nums[0];
        int ans = nums[0];
        for(int i =1; i<nums.length; i++){
            int v1 = maximumending*nums[i];
            int v2 = nums[i];
            int v3 = minimumending*nums[i];
            maximumending = Math.max(v2,Math.max(v1,v3));
            minimumending = Math.min(v2,Math.min(v1,v3));
            ans = Math.max(ans,Math.max(minimumending, maximumending));
        }
        return ans;
        
    }
}