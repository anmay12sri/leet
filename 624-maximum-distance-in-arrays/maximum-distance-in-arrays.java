class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int maxdist=0;

        for(int i=1;i<arrays.size();i++){
            int curmin=arrays.get(i).get(0);
            int curmax=arrays.get(i).get(arrays.get(i).size() - 1);

            if(i>0){
                maxdist=Math.max(maxdist,Math.abs(curmax-min));
                maxdist=Math.max(maxdist,Math.abs(max-curmin));
            }
            min=Math.min(min,curmin);
            max=Math.max(max,curmax);
        }
        return maxdist;

    }
}