class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total =0;
        for(int i = 0; i<cardPoints.length; i++){
            total += cardPoints[i];
        }
        int windowsize = cardPoints.length - k;

        if(windowsize == 0){
            return total;
        }

        int windowsum = 0;
        for(int i = 0; i<windowsize; i++){
            windowsum += cardPoints[i];
        }
        int minwindow = windowsum;

        for(int i =windowsize; i<cardPoints.length; i++){
            windowsum += cardPoints[i];
            windowsum -= cardPoints[i-windowsize];

            minwindow = Math.min(windowsum, minwindow);
        }
        return total - minwindow;
    }
}