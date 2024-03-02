class Solution {
    public int[] sortedSquares(int[] nums) {
       // Arrays.sort(nums);
      //int arr[]=new int[nums.length];
      for(int i=0;i<nums.length;i++){
          nums[i]=nums[i]*nums[i];
      }
        Arrays.sort(nums);
        return nums;
    }
}