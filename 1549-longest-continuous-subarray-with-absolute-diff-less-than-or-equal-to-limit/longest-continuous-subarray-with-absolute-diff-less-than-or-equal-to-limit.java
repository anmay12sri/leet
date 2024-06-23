class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n=nums.length;
        int i=0;
        int j=0;
        int maxsub=0;
        int curmax=nums[0];
        int curmin=nums[0];
        while(j<n){
            curmax=Math.max(nums[j],curmax);
            curmin=Math.min(nums[j],curmin);
            if(curmax-curmin<=limit){
                maxsub=Math.max(j-i+1,maxsub);
                j++;
            }else{
                if(nums[i]==curmax || nums[i]==curmin){
                    curmax=nums[i+1];
                    curmin=nums[i+1];
                    for(int k=i+1;k<=j;k++){
                        curmax=Math.max(nums[k],curmax);
                        curmin=Math.min(nums[k],curmin);
                    }
                    // i++;
                }
                i++;
                j++;
            }
             
        }
        return maxsub;
    }
}