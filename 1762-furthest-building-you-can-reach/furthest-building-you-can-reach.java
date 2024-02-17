class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
         PriorityQueue<Integer>p=new PriorityQueue<>();
         for(int i=1;i<heights.length;i++){
             int diff=heights[i]-heights[i-1];
             if(diff>0){
                 p.add(diff);
             }
             if(p.size()>ladders){
                 bricks=bricks-p.poll();
             }
             if(bricks<0){
                 return i-1;
             }
         }
         if(bricks>=0)return heights.length-1;
         return -1;
    }
}