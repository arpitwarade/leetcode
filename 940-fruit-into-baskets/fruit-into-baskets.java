class Solution {
    public int totalFruit(int[] fruits) {
        int n= fruits.length;
        int low =0;
        int res = -1;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int high =0; high<n; high++){
            int num = fruits[high];
            mp.put(num, mp.getOrDefault(num,0)+1);

            while(mp.size() > 2){
                int z = fruits[low];
                
                mp.put(z,mp.getOrDefault(z,0)-1);
                if(mp.get(z) == 0){
                    mp.remove(z);
                }
                low++;
            }
            if(mp.size() <= 2){
                res = Math.max(res, high-low+1);
            }
        }
        return res;
       
    }
}