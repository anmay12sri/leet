class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int u=Integer.MIN_VALUE;

        for(int e:piles){
            u=Math.max(e,u);
        }
        while(l<=u){
            int mid=l+(u-l)/2;
            int time=helper(piles,mid);
            if(time<=h){
                u=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;

    }
    public int helper(int piles[],int hour){
        int sum=0;
        for(int i=0;i<piles.length;i++){
             sum+=Math.ceil((double)piles[i]/(double)hour);
        }
        return sum;
    }
}