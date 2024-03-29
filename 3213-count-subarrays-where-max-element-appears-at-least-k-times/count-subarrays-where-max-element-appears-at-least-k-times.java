class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
        }
        int i=0;
        int r=0;
        int count=0;
        long res=0;
        while(r<nums.length){
            if(nums[r]==max)
                count++;
            
            while(count>=k){
                 res+=nums.length-r;
                 if(nums[i]==max){
                    count--;
                   
                 }
                i++;  
            }
            r++;

        }
        return res;
    }
}