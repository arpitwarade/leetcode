class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int low =0;
        int res =1;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int high=0; high<n; high++){
            int num = fruits[high];
            mp.put(num, mp.getOrDefault(num, 0) +1);
            while(mp.size()>2){
                int leftnum = fruits[low];
                mp.put(leftnum, mp.get(leftnum) - 1);
                if (mp.get(leftnum) == 0)
                    mp.remove(leftnum);
                low++;
            }
             if (mp.size() <= 2) {
                res = Math.max(res, high - low + 1);
            }

            } 
            return res;
       
    }
}