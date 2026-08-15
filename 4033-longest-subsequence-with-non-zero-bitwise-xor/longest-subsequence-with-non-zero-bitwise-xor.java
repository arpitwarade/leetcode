class Solution {
    public int longestSubsequence(int[] nums) {
      int XOR = 0;
      boolean hasnonZero = false;
      for(int num : nums){
        XOR = XOR^num;
        if(XOR != 0){
            hasnonZero = true;
        }
      }
      if(XOR != 0){
        return nums.length; 
      }
      if(hasnonZero){
        return nums.length-1;
      }
      return 0;
        
    }
}