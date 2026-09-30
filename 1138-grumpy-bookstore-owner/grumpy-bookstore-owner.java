class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sat = 0;
        for(int i =0; i<customers.length; i++){
            if(grumpy[i] == 0){
                sat += customers[i];
            }
        }
        int extra = 0;

        for(int i =0; i<minutes; i++){
            if(grumpy[i] == 1){
               extra += customers[i];
            }
        }
        int maxextra = extra;

        for(int i = minutes; i< customers.length; i++){
            if(grumpy[i] == 1){
               extra += customers[i];
            }

            if(grumpy[i-minutes] == 1){
                extra -= customers[i-minutes];
            }

            maxextra = Math.max(extra, maxextra);
        }
        return maxextra+sat;
    }
}