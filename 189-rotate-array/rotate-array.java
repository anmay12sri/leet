class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rotation(nums,0,nums.length-1);
        rotation(nums,0,k-1);
        rotation(nums,k,nums.length-1);
    }
    public void rotation(int[]nums,int s,int e){
        while(s<=e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}