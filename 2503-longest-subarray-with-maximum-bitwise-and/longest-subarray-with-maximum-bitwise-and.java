class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        int ans=0;
        for(int num:nums){
            max=Math.max(num,max);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                count++;
            }else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}