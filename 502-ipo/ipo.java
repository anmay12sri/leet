class Solution {
    private static class Project{
        int profit;
        int capital;

        Project(int profit,int capital){
            this.profit=profit;
            this.capital=capital;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;

        List<Project>pro=new ArrayList<>();

        for(int i=0;i<n;i++){
            pro.add(new Project(profits[i],capital[i]));
        }
        Collections.sort(pro, (a, b) -> Integer.compare(a.capital,b.capital));

        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        int i=0;
        while(k>0){
            while(i<n && pro.get(i).capital<=w){
                maxHeap.add(pro.get(i).profit);
                i++;
            }

                if(!maxHeap.isEmpty()){
                    w+=maxHeap.remove();
                }else{
                    break;
                }
                k--;
            }
        
        return w;
    }
}