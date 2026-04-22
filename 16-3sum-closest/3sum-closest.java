class Solution {
    public int threeSumClosest(int[] nums, int target) {
           int var =0;
           int cons =0;
           int s = 0;
           int e = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                      
                       var = nums[i]+nums[j]+nums[k];
                     if(var == target){
                        return var;
                     }
                     else{
                        cons = (int)Math.abs(var-target);
                        if(cons < e){
                            e = cons;
                            s = var;
                        }
                     } 
                }
            }
        }
        return s;
    }
}