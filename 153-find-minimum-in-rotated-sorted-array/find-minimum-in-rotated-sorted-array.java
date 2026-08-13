class Solution {
    public int findMin(int[] arr) {
        // int n = arr.length;
        // int low = 0;
        // int high = n-1;
        // int res =0;
        // while(low<= high){
        //     int mid= (low+high)/2;
        //     if(arr[mid] > arr[n-1]){
        //         low = mid+1;
        //     }
        //     else{
        //         res = mid;
        //         high = mid-1;
        //     }
        // }
        // return arr[res];

















        int n = arr.length;
        int low = 0;
        int high = n-1;
        int res = -1;

        while(low<= high){
            int mid = (low+high)/2;

            if(arr[mid] > arr[n-1]){
                low = mid+1;
            }
            else{
                res = mid;
                high = mid-1;
            }
        }
        return arr[res];
    }
}