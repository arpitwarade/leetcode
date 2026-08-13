class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        ArrayList<Integer> lt = new ArrayList<>();
        for(int i =0; i<nums1.length; i++){
            st1.add(nums1[i]);
        }
        for(int i =0; i<nums2.length; i++){
            st2.add(nums2[i]);
        }
        for(int n : st1){
            if(st2.contains(n)){
                lt.add(n);
            }
        }
        int l = lt.size();
        int []arr = new int[l];
        int n = 0;
        for(int i : lt){
            arr[n] = i;
            n++;
        }
        return arr;
    }      
}
