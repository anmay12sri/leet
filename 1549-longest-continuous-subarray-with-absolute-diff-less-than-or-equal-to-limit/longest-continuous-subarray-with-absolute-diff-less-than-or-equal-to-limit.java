class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n=nums.length;
        int i=0;
        int j=0;
        int curmin=nums[0];
        int curmax=nums[0];
        int maxsub=0;
        while(j<n){
            curmin=Math.min(nums[j],curmin);
            curmax=Math.max(nums[j],curmax);
            if(curmax-curmin<=limit){
                maxsub=Math.max(maxsub,j-i+1);
            j++;
            }
        else{
        
            if(nums[i]==curmin || nums[i]==curmax){
                curmin=nums[i+1];
                curmax=nums[i+1];
                for(int k=i+1;k<=j;k++){
                    curmin=Math.min(nums[k],curmin);
                    curmax=Math.max(nums[k],curmax);
                }
            }
            i++;
            j++;
        }
    }
        return maxsub;
    }
}