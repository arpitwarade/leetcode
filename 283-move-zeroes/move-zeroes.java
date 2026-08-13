class Solution {
    public void moveZeroes(int[] nums) {
        int lastZeroCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastZeroCount] = nums[i];
                lastZeroCount++;
            }
        }
        for(int i =lastZeroCount; i< nums.length; i++){
            nums[i] = 0;
        }
        
    }
}