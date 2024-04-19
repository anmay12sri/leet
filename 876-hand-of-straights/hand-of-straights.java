class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }else{
            PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<hand.length;i++){
          pq.offer(hand[i]);
        }
        while(!pq.isEmpty()){
            int head=pq.peek();
            for(int i=0;i<groupSize;i++){
                if(!pq.contains(head+i)){
                    return false;
                }else{
                    pq.remove(head+i);
                }
            }
        }
        }
        return true;
    }
}