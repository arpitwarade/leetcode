class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocnt  = 0;
        int res = -1;
        int low = 0; 
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                zerocnt++;
            }

            if(zerocnt > k){
                if(nums[low] == 0){
                    zerocnt--;
                }
                low++;
            }
            res= Math.max(res,i-low+1);
        } 
        return res;
    }
}