class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        int low = 0;
        int res = 0;
        for(int high =0; high<n; high++){
            int x = nums[high];
            mp.put(x,mp.getOrDefault(x, 0)+1);
            if(mp.containsKey(x)){
                if(mp.get(x) <= k){
                    res = Math.max(res,(high-low+1));
                }
                else{
                    while(mp.get(x) > k){
                    int left = nums[low];
                    mp.put(left,mp.getOrDefault(left,0)-1);
                    low++;
                    }
                }
            }
            else{
                res = Math.max(res,(high-low+1));
            }
        }
        return res;
    }
}