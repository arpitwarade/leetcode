class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int nearSum = nums[0] + nums[1] + nums[2];

        for (int fIdx = 0; fIdx < nums.length - 2; fIdx++) {

            int sIdx = fIdx + 1;
            int lIdx = nums.length - 1;

            while (sIdx < lIdx) {

                int add = nums[fIdx] + nums[sIdx] + nums[lIdx];

                if (Math.abs(add - target) < Math.abs(nearSum - target)) {
                    nearSum = add;
                }

                if (add == target) {
                    return add;
                } else if (add < target) {
                    sIdx++;
                } else {
                    lIdx--;
                }
            }
        }

        return nearSum;
    }
}