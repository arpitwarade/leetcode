class Solution {
    public boolean uniformArray(int[] nums1) {
        int n =  Integer.MAX_VALUE;

        for(int m : nums1){
            n = Math.min(n,m);
        }

        if(n %2 != 0){
            return true; 
        }

        if(n %2 == 0){
            for(int m : nums1){
                if(m % 2 != 0){
                    return false;
                }
            }
        }
        return true;
    }
}