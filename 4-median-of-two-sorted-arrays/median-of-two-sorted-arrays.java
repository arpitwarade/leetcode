class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int []temp = new int[nums1.length+ nums2.length];
      int i =0;
      int j =0;
      int n =0;
      while(i< nums1.length && j < nums2.length){
        if(nums1[i] > nums2[j]){
            temp[n++] = nums2[j];
            j++;
        }
        else if(nums1[i] < nums2[j]){
            temp[n++] = nums1[i];
            i++;
        }
        else{
            temp[n++] = nums1[i];
            temp[n++] = nums2[j];
            i++; j++;
        }
      }

        while (i < nums1.length) {
            temp[n++] = nums1[i++];
        }

        while (j < nums2.length) {
            temp[n++] = nums2[j++];
        }
      if(temp.length%2 == 0){
        return (double) (temp[temp.length/2]+temp[temp.length/2-1])/2;
      }
      return (double) temp[temp.length/2];
    }
}