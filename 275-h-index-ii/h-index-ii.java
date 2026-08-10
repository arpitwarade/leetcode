class Solution {
    public int hIndex(int[] citations) {
     int n = citations.length;
     int low = 0;
     int high =  n-1;
     int res = 0;
     while(low<= high)
     {
        int mid = (low+high)/2;
        int paper = n-mid;
        if(citations[mid] >= paper){
            res = paper;
            high = mid-1;
        }
        else{
            low = mid+1;
        }
     } 
     return res;
    }
}