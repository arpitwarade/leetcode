// class Solution {
//     public long[] distance(int[] nums) {
//         long arr[] = new long[nums.length];
//         int forward = 0;
//         int backward =0;
//         int total =0;
//         for(int i =0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     forward =forward + Math.abs(i-j);
//                 }
//             }
//             for(int k =i; k>=0; k--){
//                 if(nums[i] == nums[k]){
//                     backward += Math.abs(k-i);
//                 }
//             }
//             if(forward == 0 && backward == 0){
//                 arr[i] = 0;
//             }
//             arr[i] = forward+backward;
//             forward =0;
//             backward =0;
//         }
//         return arr;
//     }
// }

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, Long> sum = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = nums[i];

            if (count.containsKey(val)) {
                res[i] += (long)i * count.get(val) - sum.get(val);
            }

            count.put(val, count.getOrDefault(val, 0) + 1);
            sum.put(val, sum.getOrDefault(val, 0L) + i);
        }

        sum.clear();
        count.clear();
        for (int i = n - 1; i >= 0; i--) {
            int val = nums[i];

            if (count.containsKey(val)) {
                res[i] += sum.get(val) - (long)i * count.get(val);
            }

            count.put(val, count.getOrDefault(val, 0) + 1);
            sum.put(val, sum.getOrDefault(val, 0L) + i);
        }

        return res;
    }
}