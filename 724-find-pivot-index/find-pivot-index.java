class Solution {
    public int pivotIndex(int[] nums) {
        // int []prefixsum = new int[nums.length];
        // int []sufixsum = new int[nums.length];

        // prefixsum[0] = 0;
        // sufixsum[nums.length-1] = 0;
        // for(int i = 1; i<nums.length; i++){
        //     prefixsum[i] = prefixsum[i-1]+ nums[i-1];
        // }
        // for(int i =nums.length-2; i>=0; i--){
        //     sufixsum[i] = sufixsum[i+1]+ nums[i+1];
        // }
        // for(int i = 0; i<nums.length; i++){
        //     if(prefixsum[i] == sufixsum[i])
        //     {
        //         return i; 
        //     }
        // }
        // return -1;


        int n = nums.length;
        int []prefixsum = new int[n];
        int []suffixsum = new int[n];

        prefixsum[0] = 0;
        suffixsum[n-1] = 0;

        for(int i = 1; i<n; i++){
            prefixsum[i] = prefixsum[i-1]+nums[i-1];
        }
        for(int i = n-2; i>=0; i--){
            suffixsum[i] = suffixsum[i+1]+nums[i+1];
        }
        for(int i = 0; i< n; i++){
            if(prefixsum[i] == suffixsum[i]){
                return i;
            }
        } 
        return -1;

    }
}