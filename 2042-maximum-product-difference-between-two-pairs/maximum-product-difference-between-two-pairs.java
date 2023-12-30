class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int product=1;

        for(int i=0;i<nums.length;i++){
            product=(nums[nums.length-1]*nums[nums.length-2])-(nums[1]*nums[0]);
        }
        return product;
    }
}