class Solution {
    public int findMaxK(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==(-nums[j]) || (-nums[i])==nums[j]){
                    max=Math.max(Math.abs(nums[i]),max);
                }
            }
        }
        return max;
    }
}