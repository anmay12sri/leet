class Solution {
    public long maxKelements(int[] nums, int k) {
        long res=0;
        Queue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int x:nums){
            pq.add(x);
        }
        // 10 3 3 3 1

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