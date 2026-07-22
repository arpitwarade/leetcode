class Solution {
    public int maxArea(int[] height) {
        int left= 0;
        int right = height.length-1;
        int maxWater=0;
        int tmpWater=0;
        int width;
        int heighttmp;
         for(int i=0; i<height.length;i++){
            width = right-left;
            heighttmp=Math.min(height[left],height[right]);
            tmpWater = width*heighttmp;

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            if(tmpWater>maxWater){
                maxWater=tmpWater;
            }
         }
        return maxWater;
    }
}