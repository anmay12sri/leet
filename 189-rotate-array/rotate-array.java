class Solution {

    public static void arr(int nums[],int s,int e){
        
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        arr(nums,0,nums.length-1);
        arr(nums,0,k-1);
        arr(nums,k,nums.length-1);
    }
}