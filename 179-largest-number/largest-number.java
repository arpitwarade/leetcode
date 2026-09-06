class Solution {
    public String largestNumber(int[] nums) {
    ArrayList<String> ar = new ArrayList<>();

    for(int i = 0; i<nums.length; i++){
        ar.add(String.valueOf(nums[i]));
    }

    Collections.sort(ar, (a,b)-> (b+a).compareTo(a+b));
    if(ar.get(0).equals("0")){
        return "0";
    }
    StringBuilder sb = new StringBuilder();

    for(String s : ar){
        sb.append(s);
    }
    return sb.toString();
    }
}