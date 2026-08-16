class Solution {
  
    public int longestOnes(int[] nums, int k) {
        int zerocnt = 0;
        int res = 0;
        int low = 0;
        for(int high =0 ; high<nums.length; high++){
            if (nums[high]==0){
                zerocnt++;
            }
            if(zerocnt > k){
                if(nums[low] ==0 ){
                    zerocnt--;
                }
                low++;
                
            }

            res = Math.max(res, high-low+1);

        }
        return res;

    }
}