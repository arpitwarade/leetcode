class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int repeat =-1;
        int sum = n*(n+1)/2;
        Set<Integer> mp  = new HashSet<>();
        for(int i: nums){
            if(mp.contains(i)){
                repeat = i;
            }
            else{
                mp.add(i);
                sum -=  i;
            }

        }
        return new int[]{repeat, sum};
    }
}