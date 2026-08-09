class Solution {
    public long helper(int [] arr, int n, int speed){
        long h =0;
        for(int i =0; i<n; i++){
            h = h + arr[i]/speed;

            if((arr[i]%speed) != 0){
                h++;
            }
        }
        return h;
    }
      public int minEatingSpeed(int[] piles, int h) {
        int res = 0;
        int n = piles.length;
        Arrays.sort(piles);
        int low =1;
        int high = piles[n-1];

        while(low <=  high){
            int mid = (high+low)/2;
            long hour = helper(piles,n,mid);
            if(hour >h){
                low = mid+1;
            }
            else{
                res = mid;
                high = mid-1;
            }

        }
        return res;
    }
}