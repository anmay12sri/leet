class Solution {
    int memo[];
     boolean solve(int nums[], int ind, int n, int memo[]){
      if(ind==n-1){
        return true;
      }
        if(memo[ind]!=0){
            return memo[ind]==1;
        }
      for(int i=1;i<=nums[ind];i++){
        if(solve(nums,ind+i,n,memo)==true){
            memo[ind]=1;
            return true;
        }
      }
      memo[ind]=-1;
      return false;
     }
    public boolean canJump(int[] nums) {
        int n=nums.length;
        memo=new int[n+1];
        return solve(nums,0,n, memo); 
    }
}