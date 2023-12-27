class Solution {
    public int countTestedDevices(int[] nums) {
        int x=0;//subtract krne ke liye
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-x>0){// 1>0 
              x++;//1
              ans++;//1
            }
        }
        return ans;
    }
}