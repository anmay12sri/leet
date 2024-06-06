class Solution {
    public int waysToMakeFair(int[] nums) {
        int e=0,o=0;//2,1,6,4
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                e+=nums[i];//8
            }else{
                o+=nums[i];//5
            }


        }
        int prevEven=0;
        int prevOdd=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                e-=nums[i];
                if(e+prevOdd==o+prevEven){
                    count++;
                }
                    prevEven+=nums[i];
                
            }else{
                o-=nums[i];
                if(o+prevEven==e+prevOdd){
                    count++;
                } 
                    prevOdd+=nums[i];
                
            }
        }
        return count;

    }
}