class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i =0; i< nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int z = (nums[i] - 1)*(nums[j]-1);

                max= Math.max(z, max);
            }
        }
        return max;
        
    }
}