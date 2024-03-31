class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minKpos=-1;
        int maxKpos=-1;
        int culprit=-1;
        long ans=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                culprit=i;
            }
            if(nums[i]==minK){
                minKpos=i;
            }
            if(nums[i]==maxK){
                maxKpos=i;
            }

            long smaller=Math.min(minKpos,maxKpos);
            long temp=smaller-culprit;

            ans+=(temp<=0)?0:temp;
        }
        return ans;
    }
}