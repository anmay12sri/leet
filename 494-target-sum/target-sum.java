class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return sum(nums,0,0,target); 
    }
    public int sum(int nums[],int i,int curr,int target){
             if(i==nums.length){
                 if(curr==target)return 1;
                 return 0;
             }
             int left=sum(nums,i+1,curr+nums[i],target);
             int right=sum(nums,i+1,curr-nums[i],target);
             return left+right;
    }
}