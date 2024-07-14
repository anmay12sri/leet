class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);//-4 -1 1 2

      int closest_sum=Integer.MAX_VALUE/2;

      for(int i=0;i<nums.length-2;i++){
        int l=i+1;
        int r=nums.length-1;
        while(l<r){
            int curr_sum=nums[l]+nums[r]+nums[i];
            if(Math.abs(curr_sum-target)<Math.abs(closest_sum-target)){
                closest_sum=curr_sum;
            }
            if(curr_sum>target){
                r--;
            }else if(curr_sum<target){
                l++;
            }else{
                return curr_sum;
            }
        }
      }
      return closest_sum;

    }
}