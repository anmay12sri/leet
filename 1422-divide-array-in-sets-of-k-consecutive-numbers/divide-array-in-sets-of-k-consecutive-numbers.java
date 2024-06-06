class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        
        if(nums.length%k!=0)return false;
      

      PriorityQueue<Integer>pq=new PriorityQueue<>();
      for(int i=0;i<nums.length;i++){
        pq.offer(nums[i]);
      }

      while(!pq.isEmpty()){
        int head=pq.peek();
        for(int i=0;i<k;i++){
            while(!pq.contains(head+i)){
                return false;
            }
            pq.remove(head+i);
        }
      }
      return true;

    }
}