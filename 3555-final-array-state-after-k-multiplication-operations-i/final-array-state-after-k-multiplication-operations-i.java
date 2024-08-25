class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int num[]=new int[nums.length];

        for(int i=0;i<k;i++){
        int ind=-1;
        int min=Integer.MAX_VALUE;
         for(int j=0;j<nums.length;j++){
              if(min>nums[j]){
                min=nums[j];
                ind=j;
              }
        }
        nums[ind]=nums[ind]*multiplier;
        
    }
    return nums;
}
}