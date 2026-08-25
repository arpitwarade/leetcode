class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for(int i  = 0 ; i<nums.length; i++){
            st.add(nums[i]);
        }
        int i = 1;
        while(true){
            int num = i*k;
            if(!st.contains(num)){
                return num;
            }
            i++;
        }
        
    }
}