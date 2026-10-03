class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low =0;
        int sum = 0;
        int res = nums.length+1;

        for(int i = 0; i< nums.length; i++){
            sum += nums[i];

            while(sum >= target){
                int len =  i- low+1;
                res = Math.min(len, res);
                sum -= nums[low];
                low++;
            }
        }
        return res == nums.length+1 ? 0 : res;
        
    }
}