class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int loses[]=new int[1000001];//[-1,0,1,0,0,0,0...]

        for(int i=0;i<matches.length;i++){
            int win=matches[i][0];
            int lose=matches[i][1];

            if(loses[win]==0){
                loses[win]=-1;//1  
            }
            if(loses[lose]==-1){
                loses[lose]=1;
            }else{
                loses[lose]++;//3
            }
        }

        List<Integer>zeroloss=new ArrayList<>();
        List<Integer>oneloss=new ArrayList<>();

        List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<loses.length;i++){
            if(loses[i]==-1){
                zeroloss.add(i);
            }else if(loses[i]==1){
                oneloss.add(i);
            }
        }
        res.add(zeroloss);
        res.add(oneloss);

        return res;
    }
}