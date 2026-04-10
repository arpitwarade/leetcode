class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int s = list1.length;
        int s1 = list2.length;
      Map<String,Integer> map = new HashMap<>();
      for(int i = 0; i< s; i++){
        map.put(list1[i],i);
      }
      int min = Integer.MAX_VALUE;
      ArrayList <String> list = new ArrayList<>();
      for(int j = 0; j<s1; j++){
        if(map.containsKey(list2[j])){
            int i = map.get(list2[j]);
            int sum = i+j;
            if(min>sum){
                list.clear();
                list.add(list2[j]);
                min = sum;
            }
            else if(min == sum){
                list.add(list2[j]);
            }
        }
      }
      return list.toArray(new String[0]);
    }
}