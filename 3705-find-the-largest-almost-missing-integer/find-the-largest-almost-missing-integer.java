class Solution {
    public int largestInteger(int[] nums, int k) {
        // Map<Integer,Integer> freq = new HashMap<>();
        // Map<Integer,Integer> window = new HashMap<>();

        // for(int i = 0; i<k; i++){
        //     freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        // }
        // for(int i: freq.keySet()){
        //     window.put(i, 1);
        // }

        // for(int i = k; i<nums.length; i++){

        //     int out = nums[i-k];
        //     freq.put(out, freq.getOrDefault(out,0)-1);
        //     if(freq.get(out)==0){
        //         freq.remove(out);
        //     }

        //     int in = nums[i];
        //     freq.put(in, freq.getOrDefault(in, 0)+1);

        //     for(int j : freq.keySet()){
        //         window.put(j, window.getOrDefault(j,0)+1);
        //     }
        // }
        // int ans = -1;

        // for(int i: window.keySet()){
        //     if(window.get(i) == 1){
        //         ans= Math.max(ans,i);
        //     }
        // }
        // return ans;
           if (k == nums.length) {
            Set<Integer> set = new HashSet<>();

            int ans = -1;

            for (int x : nums) {
                if (set.add(x)) {
                    ans = Math.max(ans, x);
                }
            }

            return ans;
        }
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int window = Math.min(i+1, k) -Math.max(0,i-(nums.length-k));
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+window);
        }
        int ans =-1;
        for(int i: mp.keySet()){
            if(mp.get(i) == 1){
                ans = Math.max(i,ans);
            }

        }
        return ans;
    }
}