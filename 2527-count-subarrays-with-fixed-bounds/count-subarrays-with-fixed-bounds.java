class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       long ans=0;
     int minkposition=-1;
     int maxkposition=-1;
     int culprit =-1;
      

     for(int i=0;i<nums.length;i++){
        if(nums[i]<minK || nums[i]>maxK){
            culprit=i;
        }
             if(nums[i]==minK){
                minkposition=i;
             }

             if(nums[i]==maxK){
            maxkposition=i;
             }



            long smaller=Math.min(minkposition,maxkposition);

            long temp=smaller-culprit;

            ans+=(temp<=0)?0:temp;

             
    }
         
     
   return ans;
        
    }
}