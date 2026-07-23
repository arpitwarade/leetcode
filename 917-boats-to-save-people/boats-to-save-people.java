class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int fIdx=0;
        int lIdx = people.length-1;
        int boats =0;
        while(fIdx<=lIdx){
            if(people[fIdx]+people[lIdx]<=limit){
                fIdx++;
            }
            lIdx--;
            boats++;
        }
        return boats;
    }
}