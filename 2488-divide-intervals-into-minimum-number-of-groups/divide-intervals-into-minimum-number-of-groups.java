class Solution {
    public int minGroups(int[][] intervals) {
       int n=intervals.length;
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
        min=Math.min(min,intervals[i][0]);
        max=Math.max(max,intervals[i][1]);
       } 
       int evencounts[]=new int[max+2];
       for(int i=0;i<n;i++){
        evencounts[intervals[i][0]]++;
        evencounts[intervals[i][1]+1]--;
       }
       int maxoverlapping=0;
       int sum=0;
       for(int i=min;i<max+2;i++){
        sum+=evencounts[i];
        maxoverlapping=Math.max(maxoverlapping,sum);
       }
       return maxoverlapping;
    }
}