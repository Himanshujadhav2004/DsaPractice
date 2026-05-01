//56. Merge Intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n = intervals.length;
List<int[]> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
int start = intervals[i][0];
int end= intervals[i][1];
int j;
for( j =i+1;j<n;j++){
    if(intervals[j][0]<=end){
        end = Math.max(end,intervals[j][1]);
    }
    else{
        break;
    }
}
i=j-1;
ans.add(new int[]{start,end});
        }
        return ans.toArray(new int [ans.size()][]);
    }
}