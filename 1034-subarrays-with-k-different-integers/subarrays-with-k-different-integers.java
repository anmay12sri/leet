class Solution {
    public int most(int nums[],int k){
            Map<Integer,Integer>map=new HashMap<>();
            int i=0;
            int j=0;
            int ans=0;

            while(j<nums.length){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);

                while(map.size()>k && i<=j){
                    map.put(nums[i],map.get(nums[i])-1);

                    if(map.get(nums[i])==0)map.remove(nums[i]);
                    i++;
                }
                ans+=j-i+1;
                j++;
            }
            return ans;
        }
    public int subarraysWithKDistinct(int[] nums, int k) {
         int res=most(nums,k)-most(nums,k-1);
         return res;
    }
}