class Solution {
  
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int zerocnt=0;
        int res = Integer.MIN_VALUE;

        for(int high =0;high<n; high++){
            if(nums[high] == 0 ){
                zerocnt++;
            }
            while(zerocnt>k){
                if(nums[low]==0){
                    zerocnt--;
                }
                low++;
            }
            int length = high-low+1;
            res = Math.max(res,length);
        }
        return res;

    }
}