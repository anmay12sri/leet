class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int lastsmallest=Integer.MIN_VALUE;
        int longest=1;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastsmallest){
                count++;
                lastsmallest=nums[i];
            }
            if(lastsmallest!=nums[i]){
                count=1;
                lastsmallest=nums[i];
            }
        longest=Math.max(count,longest);
        }
        return longest;
    }
}