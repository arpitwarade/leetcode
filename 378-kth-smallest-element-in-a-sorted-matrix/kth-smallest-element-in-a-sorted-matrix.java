class Solution {
    public int helper(int [][] matrix, int m, int n, int mid){
        int row = n-1;
        int col = 0;
        int count =0;
        while(row >= 0 && col < m){
            if(matrix[row][col] <= mid){
                count = count +row+1;
                col++; 
            }
            else{
                row--;
            }
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n= matrix.length;
        int m = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[n-1][m-1];
        int res = -1;

        while(low<= high){
            int mid = (low+high)/2;
            int count = helper(matrix,m,n,mid);
            if(count < k){
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