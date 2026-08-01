class Solution {
    public int subarraySum(int[] nums, int k) {
        // int maxSum = 0;
        // int count = 0;
        // for(int i =0; i<nums.length; i++){
        //     maxSum += nums[i];
        //     if(maxSum == k){
        //         count++;
        //     }
        //     for(int j = i+1; j<nums.length; j++){
        //         maxSum += nums[j];
        //         if(maxSum == k){
        //             count++;
        //         }
        //     }
        //     maxSum =0;

        // }
        // return count;
        
        // int []prefixsum = new int[nums.length];
        // int []sufixsum = new int[nums.length];
        // int count = 0;

        // prefixsum[0] = 0;
        // sufixsum[nums.length-1] = 0;
        // for(int i = 1; i<nums.length; i++){
        //     prefixsum[i] = prefixsum[i-1]+ nums[i-1];
        // }
        // for(int i =nums.length-2; i>=0; i--){
        //     sufixsum[i] = sufixsum[i+1]+ nums[i+1];
        // }
        // for(int i = 0; i<nums.length; i++){
        //     if(prefixsum[i] ==k)
        //     {
        //         count++; 
        //     }
        //      if(sufixsum[i] ==k)
        //     {
        //         count++; 
        //     }
        // }
        // return count;

        // }

        int n= nums.length;
        int sum = 0;
        int ans =0;
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i =0; i<n; i++){
            sum += nums[i];

            ans+= map.getOrDefault(sum-k, 0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;

    }

}