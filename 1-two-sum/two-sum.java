class Solution{
    public static int[] twoSum(int nums[], int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int required = target-nums[i];
            if(mp.containsKey(required)){
                return new int[]{mp.get(required), i};
            }
            else{
                mp.put(nums[i],i); 
           }
        }
        return new int[]{-1,-1};

    }
    
}