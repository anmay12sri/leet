class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         int i=0;
         int j=0;
         int oddcount=0;
         int temp=0;
         int subarr=0;

         while(j<nums.length){
            if(nums[j]%2==1){
             oddcount++;
             temp=0;

            }
            while(oddcount==k){
               temp++;
               if(nums[i]%2==1){
                 oddcount--;
               } 
               i++;
            }
            subarr+=temp;
            j++;
         }
         return subarr;


    }
}