class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        long pfix[]=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            pfix[i]=sum;
            sum+=nums[i];
        }

        for(int i=nums.length-1;i>=2;i--){
            if(nums[i]<pfix[i]){
                return nums[i]+pfix[i];
            }
        }
        return -1;
    }
}