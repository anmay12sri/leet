class Solution {
    public int waysToMakeFair(int[] nums) {
        int e=0,o=0;

        for(int i=0;i<nums.length;i++){
             if(i%2==0){
                e+=nums[i];
             }else{
                o+=nums[i];
             }
        }
        int prevEven=0;
        int prevOdd=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                e-=nums[i];
                if(prevEven+o==prevOdd+e){
                    count++;
                }
                prevEven+=nums[i];
            }else{
                o-=nums[i];
                if(prevOdd+e==prevEven+o){
                    count++;
                }
                prevOdd+=nums[i];
            }
        }
        return count;
    }
}