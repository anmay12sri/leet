class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>minhp=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minhp.offer(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>minhp.peek()){
                minhp.poll();
                minhp.offer(nums[i]);
            }
        }
           return minhp.peek();
    }
}