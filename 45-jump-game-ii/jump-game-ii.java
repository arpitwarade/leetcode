// class Solution {
//     public int jump(int[] nums) {
        
//         if(nums.length == 1){
//         return 0;
//       }
//         int count=0;
//         int minCount =0;
//         int maxReach =0;
//         int lastReach = 0;
//         for(int i =0; i<nums.length; i++){
//             if(i>maxReach){
//                 return 0;
//             }
//             maxReach = (int)Math.max(maxReach,(nums[i]+i));
//             if(maxReach != lastReach){
//                  count++;
//                  lastReach = maxReach;
//             }
            
//             if(maxReach >= nums.length-1){
//                   minCount = count;
//                   count = 0;
//                   break;
//                }
//         }
//         return minCount;       
//     }   
// }

class Solution {
    public int jump(int[] nums) {

        int jumps = 0;
        int end = 0;
        int maxReach = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            maxReach = Math.max(maxReach, i + nums[i]);

          if (i == end) {
                jumps++;
                end = maxReach;
            }
        }

        return jumps;
    }
}