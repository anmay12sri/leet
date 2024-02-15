class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums); 
        long sum=0;
        long perisum[]=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            perisum[i]=sum;
            sum+=nums[i];
        }
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i]<perisum[i])
            return perisum[i]+nums[i];
        }
        return -1;
    }
}