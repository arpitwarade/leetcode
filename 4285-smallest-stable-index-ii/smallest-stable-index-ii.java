class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int []suffix = new int[nums.length];
        suffix[nums.length-1] = nums[nums.length-1];

        for(int i = nums.length-2; i>= 0; i--){
            suffix[i] = Math.min(nums[i], suffix[i+1]);
        }

        int prefixmax = nums[0];
        for(int i = 0; i< nums.length; i++){
            prefixmax  = Math.max(nums[i], prefixmax);

            if(prefixmax-suffix[i] <= k){
                return i;
            } 
        } 
        return -1;   
    }
}