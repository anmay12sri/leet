class Solution {
    public long countSubarrays(int[] nums, long k) {
        long  sum=0;
        long  ans=0;
        for(int i=0,j=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum*(i-j+1)>=k){
                sum=sum-nums[j];
                j++;
            }
            ans+=i-j+1;
        }
        return ans;
        
    }
}