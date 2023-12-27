class Solution {
    public int countTestedDevices(int[] nums) {
        int ans=0;
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-x>0){
                x++;
                ans++;
            }
        }
        return ans;
    }
}