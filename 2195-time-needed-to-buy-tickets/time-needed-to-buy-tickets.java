class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer>q=new LinkedList();
        int time=0;
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            time++;
            int id=q.poll();
            tickets[id]--;

            if(id==k && tickets[id]==0)return time;
            if(tickets[id]>0){
            q.add(id);
            }

        }
        return time;

    }
}