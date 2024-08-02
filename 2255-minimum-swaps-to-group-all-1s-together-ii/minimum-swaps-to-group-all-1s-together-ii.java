class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int x:nums){
         if(x==1){
            count++;
         }
        }
        if(count==0|| count==n){
            return 0;
        }
        int curr=0;
        for(int i=0;i<count;i++){
            curr+=nums[i];
        }
        int max=curr;
        for(int i=0;i<n;i++){
            curr-=nums[i];
            curr+=nums[(i+count)%n];
            max=Math.max(max,curr);

        }
        return count-max;

    }
}