// class Solution {
//     public long helper(int [] arr, int n, int speed){
//         long h =0;
//         for(int i =0; i<n; i++){
//             h = h + arr[i]/speed;

//             if((arr[i]%speed) != 0){
//                 h++;
//             }
//         }
//         return h;
//     }
//       public int minEatingSpeed(int[] piles, int h) {
//         int res = 0;
//         int n = piles.length;
//         Arrays.sort(piles);
//         int low =1;
//         int high = 0;
//         for(int pile : piles) {
//                   high = Math.max(high, pile);
//             }

//         while(low <=  high){
//             int mid = (high+low)/2;
//             long hour = helper(piles,n,mid);
//             if(hour >h){
//                 low = mid+1;
//             }
//             else{
//                 res = mid;
//                 high = mid-1;
//             }

//         }
//         return res;
//     }
// }

 class Solution{
    public boolean helper(int []piles, int h, long mid){
        long hrs = 0;
        for(int i =0; i<piles.length; i++){
            hrs += piles[i]/mid;
            if(piles[i]%mid != 0){
                hrs++;
            }
        }
        if(hrs > h){
            return false;
        }
        else{
            return true;
        }
    }
    public int minEatingSpeed(int[] piles, int h){
        long low = 1;
        long high = Long.MIN_VALUE;
        long res = -1;
        for(long n : piles){
            high = Math.max(n,high);
        }
        while(low <= high){
            long mid = (low+high)/2;
            if(helper(piles,h,mid)){
                high = mid-1;
                res = mid;
            }
            else{
                low = mid+1;
            }
        }
        return (int)res;
    } 
}