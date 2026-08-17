class Solution {
    public boolean helper(int[] position, int mid, int m){
        int last= position[0];
        int curr = 1;
        for(int i = 1; i<position.length; i++){
            if((position[i]-last) >=  mid){
                curr++;
                last = position[i];
            }
                
        }
        if(curr >= m){
            return true;
        }
        else{
            return false;
        }
    }
    public int maxDistance(int[] position, int m) { 
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1]-position[0];
        int res = -1;
        while(low <= high){
            int mid = (low+high)/2;

            if(helper(position,mid,m)){
                res = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return res;
    }
}