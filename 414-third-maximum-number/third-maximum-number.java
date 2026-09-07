class Solution {
    public int thirdMax(int[] nums) {

        long n1 = Long.MIN_VALUE;
        long n2 = Long.MIN_VALUE;
        long n3 = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == n1 || num == n2 || num == n3) {
                continue;
            }

            if (num > n1) {
                n3 = n2;
                n2 = n1;
                n1 = num;
            }
            else if (num > n2) {
                n3 = n2;
                n2 = num;
            }
            else if (num > n3) {
                n3 = num;
            }
        }

        if (n3 == Long.MIN_VALUE) {
            return (int)n1;
        }

        return (int)n3;
    }
}