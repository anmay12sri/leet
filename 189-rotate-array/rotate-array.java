class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%nums.length;
        rotatee(nums,0,n-1);
        rotatee(nums,0,k-1);
        rotatee(nums,k,n-1);

    }
    public static void rotatee(int nums[],int s,int e){
        if(s>=e){
            return;
        }
        while(s<=e){
           int temp=nums[s];
           nums[s]=nums[e];
           nums[e]=temp;
           s++;
           e--;
        }
    }

}