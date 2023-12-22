class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];//2
        int operation=0;

        for(int i=0;i<nums.length;i++){
            operation+=Math.abs(mid-nums[i]);
        }
        return operation;
    }
}