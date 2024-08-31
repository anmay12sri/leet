class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int max=0;

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i:nums){
            if(!set.contains(i-1)){
               int count=1;
               int next=i;
                while(set.contains(next+1)){
                    count++;
                    next++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
        
    }
}