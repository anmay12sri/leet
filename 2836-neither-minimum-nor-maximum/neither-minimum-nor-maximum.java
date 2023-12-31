class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;

        }
        Arrays.sort(nums);//1,2,3,4    min=1 max=4
        return nums[1];//you can write any index here between 1 to nums.length-1
        
    }
}