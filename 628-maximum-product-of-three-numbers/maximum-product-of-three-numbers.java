class Solution {
    public int maximumProduct(int[] nums) {
        int n1 = Integer.MIN_VALUE;
        int n2 = Integer.MIN_VALUE;
        int n3 = Integer.MIN_VALUE;

        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] > n1){
                n3 = n2;
                n2= n1;
                n1 = nums[i];
            }
            else if(nums[i] > n2){
                n3 =  n2;
                n2 = nums[i];
            }
            else if(nums[i] > n3){
                n3 = nums[i]; 
            }

            if(s1 > nums[i]){
                s2 = s1;
                s1 = nums[i];
            }
            else if(s2 > nums[i]){
                s2 = nums[i];
            }
        }
        int product = n1*n2*n3;
        int lproduct = s1*s2*n1;
        return Math.max(product, lproduct);
    }
}