class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        if(nums.length <= 2){
            return nums;
        }

        list1.add(nums[0]);
        list2.add(nums[1]);

        for(int i = 2; i<nums.length; i++){
            int last1 = list1.get(list1.size() - 1);
            int last2 = list2.get(list2.size() - 1);

            if(last1 > last2){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        int []arr = new int[list1.size()+list2.size()];
        int i =0;
        for(int n : list1){
            arr[i] = n;
            i++; 
        }
        for(int n : list2){
            arr[i] = n;
            i++; 
        }
        return arr;

        
    }
}