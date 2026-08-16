class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        int sum = 0;
        int cnt = 0;
        for(int n : nums){
            sum += n;

            if(mp.containsKey(sum-goal))
            {
                cnt += mp.get(sum - goal);
            }
             mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return cnt;
       }
}