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
        int prevEven=0;//2 8
        int prevOdd=0;//1
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                e-=nums[i];//6 0
                if(e+prevOdd==o+prevEven){//6==5 1!=6
                    count++;
                }
                    prevEven+=nums[i];//
                
            }else{
                o-=nums[i];//4 0
                if(o+prevEven==e+prevOdd){//4+2==6+0 8==6+1 no
                    count++;//1
                } 
                    prevOdd+=nums[i];//1 5
                
            }
        }
        return count;//1

    }
}