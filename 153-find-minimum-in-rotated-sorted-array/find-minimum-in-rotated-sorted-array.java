class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid>0 && nums[mid]<nums[mid-1])return nums[mid];
            else if(nums[mid]>nums[e]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return nums[s];
    }
}