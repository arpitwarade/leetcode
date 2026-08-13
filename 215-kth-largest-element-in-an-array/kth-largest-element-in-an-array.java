class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Queue<Integer> pq = new PriorityQueue<>((a,b) -> b -a);
        // int n = -1;
        // for(int i = 0; i<nums.length; i++){
        //     pq.add(nums[i]);
        // }
        // int i =0;
        // while(i < k){
        //     n = pq.poll();
        //     i++;
        // }
        // return n;
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<nums.length; i++){
            pq.add(nums[i]);
            if(pq.size() > k){
                 pq.poll();
            }
        }
        return pq.peek();
    }
}