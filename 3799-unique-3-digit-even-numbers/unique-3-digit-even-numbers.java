class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;
        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        for (int i = 1; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                for (int k = 0; k < 10; k++) {

                    if (k % 2 != 0) {
                        continue;
                    }

                    if (freq[i] > 0 &&
                        freq[j] > (i == j ? 1 : 0) &&
                        freq[k] > (i == k ? 1 : 0) + (j == k ? 1 : 0)) {

                        count++;
                    }
                }
            }
        }

        return count;
    }
}