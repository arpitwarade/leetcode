class Solution {
    public int mirrorDistance(int n) {
    int x= n;
    int l = 0;
    while(x>0){
        int m = x%10;
        l = l*10 + m;
        x /= 10;
    }
    return Math.abs(n-l);
        
    }
}