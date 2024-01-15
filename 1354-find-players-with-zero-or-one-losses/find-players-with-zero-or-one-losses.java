class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int loses[]=new int[1000001];
        
        for(int i=0;i<matches.length;i++){
            int win=matches[i][0];
            int lose=matches[i][1];

            if(loses[win]==0){
                loses[win]=-1;
            }
            if(loses[lose]==-1){
                loses[lose]=1;
            }else{
                loses[lose]++;
            }
        }
        List<Integer>zerolose=new ArrayList<>();
        List<Integer>onelose=new ArrayList<>();

        List<List<Integer>>result=new ArrayList<>();

        for(int i=0;i<loses.length;i++){
            if(loses[i]==-1){
                zerolose.add(i);
            }else if(loses[i]==1){
                onelose.add(i);
            }
        }
        result.add(zerolose);
        result.add(onelose);

        return result;

    }
}