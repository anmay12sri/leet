class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int totalOr=0;
         for(int i=0;i<nums.length;i++){
            totalOr|=nums[i];
         }
         int count[]=new int[1];
          backtrack(nums,totalOr,0,0,count);

          return count[0];
    }
    void backtrack(int nums[],int totalOr,int index,int current,int count[]){
        if(index==nums.length){
            if(current==totalOr){
                count[0]++;
            }
            return;
        }
        backtrack(nums,totalOr,index+1,current|nums[index],count);

        backtrack(nums,totalOr,index+1,current,count);
    }
}