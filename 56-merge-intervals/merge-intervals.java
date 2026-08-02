class Solution {
    public int[][] merge(int[][] intervals) {
     List<int[]> list = new ArrayList<>();
     Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
     int start = intervals[0][0];
     int end  = intervals[0][1];
     int n = intervals.length;
     for(int i =1; i<n; i++){
        int nextStart = intervals[i][0];
        int nextEnd = intervals[i][1];

        if(nextStart <= end){
            end = Math.max(end, nextEnd);
        }
        else{
            list.add(new int[]{start, end});
            start = nextStart;
            end = nextEnd;
        }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
    
}