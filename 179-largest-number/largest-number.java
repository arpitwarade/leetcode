class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> newlist = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            newlist.add(String.valueOf(nums[i]));
        }
        Collections.sort(newlist,(a,b) ->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String s : newlist){
            sb.append(s);
        }
        String result = sb.toString();
        if(result.startsWith("0")){
            return "0";
        }
        return result;
    }
}