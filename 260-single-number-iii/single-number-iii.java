class Solution {
    public int[] singleNumber(int[] nums) {
        int n = 0;

        for(int i : nums){
            n  = n^i;
        }
        int f = 0;
        int l = 0;

        int m = n & -n;

        for(int i : nums){
            if((i & m)!= 0){
                f = f^i;
            }
            else{
                l = l^i;
            }

            
        }
        return new int[]{f,l};
    }
}