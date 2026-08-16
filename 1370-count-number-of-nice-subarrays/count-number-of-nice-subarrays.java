class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int cnt = 0;
        int result = 0;
        Map<Integer,Integer> mp = new HashMap<>();

        mp.put(0,1);
        for(int n : nums){
            if(n %2 != 0){
                cnt++;
            }
            if(mp.containsKey(cnt - k)){
                result += mp.get(cnt-k);
            }
            mp.put(cnt, mp.getOrDefault(cnt, 0)+1);
        }
        return result;
    }
}