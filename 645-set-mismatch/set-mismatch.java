class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int total_sum=n*(n+1)/2;//10
        int actual_sum=0;
        int set_sum=0;
        
          Set<Integer>set=new HashSet<>();
        for(int i:nums){
            actual_sum+=i;//9
        }
        for(int x:nums){
            set.add(x);//1,2,4
        }
        for(int s:set){
            set_sum+=s;//7
        }

        int duplicate=actual_sum-set_sum;
        int change=total_sum-set_sum;

      return new int[]{duplicate,change};
         

    }
}