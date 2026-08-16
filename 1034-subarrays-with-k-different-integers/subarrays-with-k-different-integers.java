class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {   
        return atmost(nums,k)-atmost(nums, k-1);
       }
    public int atmost(int []nums, int k){
        Map<Integer, Integer> mp = new HashMap<>();
        int cnt =0;
        int low =0;
        for(int i =0; i<nums.length; i++){
            int n = nums[i];

            mp.put(n, mp.getOrDefault(n, 0)+1);

            while(mp.size() > k){
                int z = nums[low];

                mp.put(z,mp.getOrDefault(z, 0)-1);
                if(mp.get(z) == 0){
                    mp.remove(z);
                }
                low++;
            }
            cnt += i-low+1;
        }
        return cnt;
    }
}