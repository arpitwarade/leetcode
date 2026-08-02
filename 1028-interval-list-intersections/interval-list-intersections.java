class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        ArrayList<int[]> ans = new ArrayList<>();
        int n = firstList.length;
        int m = secondList.length;
        while(i<n && j<m){
            int fstart = firstList[i][0];
            int fend = firstList[i][1];
            int lstart = secondList[j][0];
            int lend = secondList[j][1];
            if(fstart <= lstart){
                if(fend>=lstart){
                    int e = Math.max(fstart, lstart);
                    int f = Math.min(lend,fend);
                 ans.add(new int[]{e,f}); 
                }
            }
                else{
                    if(lend >= fstart){
                        int e = Math.max(fstart,lstart);
                        int f = Math.min(lend, fend);
                        ans.add(new int[]{e,f});
                    }
                }
            if(fend<=lend){
                i++;
            }
            else{
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}