class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        long res=0;
        for(int x:nums){
            pq.offer(x);
        }
        //sorted in decreasing order
        while(k>0 && !pq.isEmpty()){
            int largest=pq.poll();
            res+=largest;
            int newval=(int)Math.ceil(largest/3.0);
            pq.add(newval);
            k--;
        }
        return res;
    }
}