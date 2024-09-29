class Solution {
    public long maximumTotalSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long sum=0;
        // int min=Integer.MAX_VALUE;
         int curr=nums[n-1];
        for(int i=n-1;i>=0;i--){
         curr=Math.min(curr,nums[i]);
            if(curr<=0){
                return -1;
            }
            sum+=curr;
            curr--;
        }
        return sum;
    }
}