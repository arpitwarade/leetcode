class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
     for(int i =0; i<stones.length; i++){
        pq.add(stones[i]);
     }   

     while(pq.size() > 1){
         int n = pq.peek();
         pq.poll();
         int z = pq.peek();
         pq.poll();

         if(n > z){
            pq.add(n-z);
         }           
     }
     if(pq.size() == 0){
        return 0;
     }else{
        return pq.peek();
     }
     
    }
}