class Solution {
    public double minimumAverage(int[] nums) {
         Arrays.sort(nums);
         int s=0;
         int e=nums.length-1;
         //double aver=(nums[s]+nums[e])/2.0;
        //  double avg[]=new double[nums.length];
        double min=Integer.MAX_VALUE;
         int i=0;
         while(s<e){
            double aver=(nums[s]+nums[e])/2.0;
            // avg[i++]=aver;
            min=Math.min(min,aver);
            s++;
            e--;
         }
          
         return min;

          
    }
}