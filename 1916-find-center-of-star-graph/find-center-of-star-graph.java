class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i =0; i<edges.length; i++){
            mp.put(edges[i][0], mp.getOrDefault(edges[i][0],0)+1);
            mp.put(edges[i][1], mp.getOrDefault(edges[i][1],0)+1);
        }
        int max = 0;
        int result =Integer.MIN_VALUE;
         for(int i : mp.keySet()){
            if(mp.get(i) > max){
                max =mp.get(i);
                result = i; 
            }
         }
         return result;
        
    }
}