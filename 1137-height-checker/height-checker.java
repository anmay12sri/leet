class Solution {
    public int heightChecker(int[] heights) {
    int count=0;
       int[] sortedNums = Arrays.copyOf(heights, heights.length);
       Arrays.sort(sortedNums);


       for(int i=0;i<heights.length;i++){
        if(heights[i]!=sortedNums[i]){
            count++;
        }
       } 
       return count;
    }
}