class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0;
        int j=0;
        int totalsub=0;
        int odd=0;
        int count=0;

        while(j<nums.length){
            if(nums[j]%2==1){
                odd++;
                count=0;
            }
            while(odd==k){
                count++;
                if(nums[i]%2==1){
                    odd--;
                }
                i++;
            }
            totalsub+=count;
            j++;
        }
        return totalsub;
    }
}