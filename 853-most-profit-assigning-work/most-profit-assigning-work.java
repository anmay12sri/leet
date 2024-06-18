class Solution1 {
    int profit;
    int difficulty;
    Solution1(int profit,int difficulty){
        this.profit=profit;
        this.difficulty=difficulty;
    }
}
    class Solution{
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int benefit=0;
        
        PriorityQueue<Solution1>maxHeap=new PriorityQueue<>((a,b)->b.profit-a.profit);
        maxHeap.add(new Solution1(0,0));

        for(int i=0;i<profit.length;i++){
            maxHeap.add(new Solution1(profit[i],difficulty[i]));
        }
        Arrays.sort(worker);

        for(int i=worker.length-1;i>=0;i--){
            while (maxHeap.peek().difficulty > worker[i]) {
                maxHeap.poll();
            }
                benefit+=maxHeap.peek().profit;
        }

        return benefit;

    }
}