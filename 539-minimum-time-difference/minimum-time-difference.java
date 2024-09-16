class Solution {
    public int findMinDifference(List<String> timePoints) {
        int []times=new int[timePoints.size()];

        for(int i=0;i<times.length;i++){
            String timearr[]=timePoints.get(i).split(":");
            times[i]=Integer.parseInt(timearr[0])*60+Integer.parseInt(timearr[1]);
        }
        Arrays.sort(times);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<times.length;i++){
            min=Math.min(times[i]-times[i-1],min);
        }
        int twentyfour=Math.abs(times[times.length-1]-(times[0]+1440));
        min=Math.min(min,twentyfour);
        return min;
    }
}