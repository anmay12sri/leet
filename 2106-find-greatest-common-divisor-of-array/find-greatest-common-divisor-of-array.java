class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int gcd=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)min=nums[i];
            if(nums[i]>max)max=nums[i];
        }

        for(int i=2;i<=min && i<=max;i++)

            if((max%i==0)&&(min%i==0))
            gcd=i;

        return gcd;
    }
}