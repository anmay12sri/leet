class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int max=Integer.MIN_VALUE;
        

        while(i<=j){
           int curr=(j-i)*Math.min(nums[i],nums[j]);
           max=Math.max(curr,max);
           if(nums[i]<nums[j]){
            i++;
           }else{
            j--;
           }
        }
        return max;
    }
}