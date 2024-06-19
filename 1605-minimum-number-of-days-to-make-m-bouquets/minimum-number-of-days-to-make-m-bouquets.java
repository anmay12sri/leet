class Solution {
    public int canMakeBouquet(int[]bloomDay,int mid,int k){
        int bouquet=0;
        int consecutive=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                consecutive++;
            }else{
                consecutive=0;
            }
            if(consecutive==k){
                bouquet++;
                consecutive=0;
            }
        }
        return bouquet;
    }
    public int minDays(int[] bloomDay, int m, int k) {
         if (bloomDay == null || bloomDay.length == 0 || m * k > bloomDay.length) {
            return -1; // Impossible to make the required bouquets
        }
      int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
       int mindays=-1;
       for(int i=0;i<bloomDay.length;i++){
        start=Math.min(bloomDay[i],start);
        end=Math.max(bloomDay[i],end);
       }
       while(start<=end){
        int mid=start+(end-start)/2;

        if(canMakeBouquet( bloomDay,  mid,k)>=m){
            mindays=mid;
            end=mid-1;
        }else{
            start=mid+1;
        }
       }
       return mindays;

    }
}