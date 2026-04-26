class Solution {
    public int subarraySum(int[] nums, int k) {
        int maxSum = 0;
        int count = 0;
        for(int i =0; i<nums.length; i++){
            maxSum += nums[i];
            if(maxSum == k){
                count++;
            }
            for(int j = i+1; j<nums.length; j++){
                maxSum += nums[j];
                if(maxSum == k){
                    count++;
                }
            }
            maxSum =0;

        }
        return count;
    }
}